package fa.training.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.xml.crypto.Data;

import com.sun.net.httpserver.Authenticator.Result;

import fa.training.comman.DatabaseConnection;
import fa.training.entites.NormalStudent;
import fa.training.exception.InvalidateDOBException;
import fa.training.exception.InvalidateFullNameException;
import fa.training.exception.InvalidatePhoneNumberException;
import fa.training.validate.invalidate;

public class NormalStudentDaoIpml {

	/**
	 * Phương thức đưa dữ liệu từ file CSV lên DB
	 */

	public void insertNormalStudentToDB() {
		String sql = "INSERT INTO NormalStudent(full_name, doB, sex, phone, university_name, grade_Level, english_score,entry_score)"
				+ "VALUES(?,?,?,?,?,?,?,?)";
		FileReader fr = null;
		BufferedReader br = null;
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			fr = new FileReader("D:\\LamLaiNormalStudent.csv");
			br = new BufferedReader(fr);
			connection = DatabaseConnection.getConnection();
			statement = connection.prepareStatement(sql);
			String line = "";
			String[] infor;
			connection.setAutoCommit(false);
			while ((line = br.readLine()) != null) {
				infor = line.split(",");
				try {
					invalidate.isFullName(infor[0]);
					invalidate.isDOB(infor[1]);
					invalidate.isPhoneNumber(infor[3]);

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

				} catch (InvalidateFullNameException | InvalidateDOBException | InvalidatePhoneNumberException e) {
					System.out.println(e.getMessage());
				} catch (Exception e) {
					System.out.println("input file have know error!");
				}
			}
			statement.executeBatch();
			connection.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Phương thức đọc danh sách từ Database
	 * 
	 */
	public static List<NormalStudent> getListNormalStudentFromDB() {
		List<NormalStudent> normalStus = new ArrayList<NormalStudent>();
		String sql = "SELECT full_name, dob, sex, phone, university_name, grade_Level, english_score, entry_score FROM NormalStudent";
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet result = null;
		try {
			connection = DatabaseConnection.getConnection();
			statement = connection.prepareStatement(sql);
			result = statement.executeQuery();
			while(result.next()) {
				var fullName = result.getString(1);
				var dob = result.getDate(2);
				var sex = result.getString(3);
				var phone = result.getString(4);
				var universityName = result.getString(5);
				var gradeLevel = result.getString(6);
				var englishScore = result.getInt(7);
				var entryTestSscore = result.getDouble(8);
				
				NormalStudent normalStudent = new NormalStudent(fullName, dob, sex, phone, universityName, gradeLevel, englishScore, entryTestSscore);
				normalStus.add(normalStudent);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return normalStus;
	}
	public boolean addNormalStudent(NormalStudent normalStudent) {
		String sql = "INSERT INTO NormalStudent(full_name, doB, sex, phone, university_name, grade_Level, english_score,entry_score) "
				+ "VALUES (?,?,?,?,?,?,?,?)";
		Connection connection = null;
		PreparedStatement statement = null;
		int result;
		try {
			connection = DatabaseConnection.getConnection();
			statement = connection.prepareStatement(sql);
			
			statement.setString(1, normalStudent.getFullName());
			statement.setDate(2, new java.sql.Date(normalStudent.getDob().getTime()));
			statement.setString(3, normalStudent.getSex());
			statement.setString(4, normalStudent.getPhone());
			statement.setString(5, normalStudent.getUniversityName());
			statement.setString(6, normalStudent.getGradeLevel());
			statement.setInt(7, normalStudent.getEnglishScore());
			statement.setDouble(8, normalStudent.getEntryTestSscore());
			result  =statement.executeUpdate();
			if (result > 0) return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean updateEnlishScoreNormalStudentByPhone(NormalStudent normalStudent) {
		String sql = "UPDATE NormalStudent SET english_score = ? WHERE phone =?";
		Connection connection = null;
		PreparedStatement statement = null;
		
		try {
			connection = DatabaseConnection.getConnection();
			statement = connection.prepareStatement(sql);
			
			statement.setInt(1, normalStudent.getEnglishScore());
			statement.setString(2, normalStudent.getPhone());
			
			if (statement.executeUpdate() >0) return true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
}
