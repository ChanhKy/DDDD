package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

import common.DatabaseConnection;
import exception.InvalidDOBException;
import exception.InvalidFullNameException;
import exception.InvalidPhoneNumberxception;
import invalid.Invalidator;

public class NormalStudentDaoImpl {
	public void insertNormalStudentToDB() {
		String sql = "INSERT INTO NormalStudent (full_name,doB,sex,phone_number, university_name, grand_level, english_score, entry_test_score) VALUES (?,?,?,?,?,?,?,?)";
		FileReader fr = null;
		BufferedReader br = null;
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			fr = new FileReader("E:\\NormalStudent.csv");
			br = new BufferedReader(fr);
			connection = DatabaseConnection.getConnection();
			statement = connection.prepareStatement(sql);
			String line = "";
			String[] infor;
			connection.setAutoCommit(false);
			while ((line = br.readLine()) != null) {
				infor = line.split(",");
				try {
					Invalidator.isFullName(infor[0]);
					Invalidator.isDOB(infor[1]);
					Invalidator.isPhoneName(infor[3]);

					statement.setString(1, infor[0]);
					statement.setDate(2,
							new java.sql.Date(new SimpleDateFormat("dd/MM/yyyy").parse(infor[1]).getTime()));
					statement.setString(3, infor[2]);
					statement.setString(4, infor[3]);
					statement.setString(5, infor[4]);
					statement.setString(6, infor[5]);
					statement.setInt(7, Integer.parseInt(infor[6]));
					statement.setDouble(8, Double.parseDouble(infor[7]));

					statement.addBatch();
				} catch (InvalidDOBException | InvalidPhoneNumberxception | InvalidFullNameException e) {
					System.out.println(e.getMessage());
				} catch (Exception e) {
					System.out.println("input file have unknow error! ");
				}
			}
			statement.executeBatch();
			connection.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
