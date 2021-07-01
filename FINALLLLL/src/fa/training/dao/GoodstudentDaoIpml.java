package fa.training.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;  

import fa.training.comman.DatabaseConnection;
import fa.training.entites.GoodStudent;
import fa.training.exception.InvalidateDOBException;
import fa.training.exception.InvalidateFullNameException;
import fa.training.exception.InvalidatePhoneNumberException;
import fa.training.validate.invalidate;

public class GoodstudentDaoIpml {

	/***
	 * phương thức ghi danh sách sinh viên từ file SCV lên Database
	 */
	public void insertFileGoodStudentToDB() {
		String sql = "INSERT INTO GoodStudent (full_name, dob, sex, phone, university_name, gradeLevel, gpa, bestWard_name)"
				+ "VALUES(?,?,?,?,?,?,?,?)";
		FileReader fr = null;
		BufferedReader br = null;
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			fr = new FileReader("D:\\LamLaiGoodStudent.csv");
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
					statement.setDouble(7, Double.parseDouble(infor[6]));
					statement.setString(8, infor[7]);

					statement.addBatch();

				} catch (InvalidateFullNameException | InvalidateDOBException | InvalidatePhoneNumberException e) {
					System.out.println(e.getMessage());
				} catch (Exception e) {
					System.out.println("input file have unknow error! ");
				}
			}
			statement.executeBatch();
			connection.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { 
				if (br == null) {
					br.close();
				}
				if (fr == null) {
					fr.close();
				}
			} catch(IOException e ) {
				e.printStackTrace();
			}
		}

	}

	/***
	 * 	Phương thức đọc tất cả danh sách sinh viên từ Database
	 * @return trả về một dánh sách 
	 */
	public static List<GoodStudent> getListGoodStudentFromDB() {
		List<GoodStudent> goodStus = new ArrayList<GoodStudent>();
		String sql = "SELECT full_name, dob, sex, phone, university_name, gradeLevel, gpa, bestWard_name FROM GoodStudent";
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet result = null;
		try {
			connection = DatabaseConnection.getConnection();
			statement = connection.prepareStatement(sql);
			result = statement.executeQuery();
			while (result.next()) {
				var fullName = result.getString(1);
				var dob = result.getDate(2);
				var sex = result.getString(3);
				var phone = result.getString(4);
				var universityName = result.getString(5);
				var gradeLevel = result.getString(6);
				var gpa = result.getDouble(7);
				var bestWardName = result.getString(8);

				GoodStudent goodStudent = new GoodStudent(fullName, dob, sex, phone, universityName, gradeLevel, gpa,
						bestWardName);
				goodStus.add(goodStudent);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return goodStus;
	}

	/**
	 * Phương thức hiển thị tất cả sinh viên theo tên trường đai học
	 * @param university
	 * @return danh sách các sinh viên cùng trường
	 */
	public List<GoodStudent> getAllgoodStudentByUniversityName(String university) {
		List<GoodStudent> goodStudents = new ArrayList<GoodStudent>();
		String sql = "SELECT * FORM GoodStudent WHERE university_name =?";
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet result = null;
		try {
			connection = DatabaseConnection.getConnection();
			statement = connection.prepareStatement(sql);
			statement.setString(1, university);
			result =statement.executeQuery();
			if (result.next()) {
				String fullName = result.getString("full_name");
				Date dob = result.getDate("dob");
				String sex = result.getString("sex");
				String phone = result.getString("phone");
				String universityName = result.getString("university_name");
				String gradeLevel = result.getString("gradeLevel");
				Double gpa = result.getDouble("gpa");
				String bestWardName = result.getString("bestWard_name");
				
				GoodStudent goodStu = new GoodStudent(fullName, dob, sex, phone, universityName, gradeLevel, gpa, bestWardName);
				goodStudents.add(goodStu);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return goodStudents;
	}
	/***
	 * 	Phuowng thức thêm mới 1 sinh viên trên DataBase, 
	 * @param goodStudent - được nhâp từ bàn phím
	 * @return
	 */
	public boolean addGoodStudent(GoodStudent goodStudent) {
		String sql = "INSERT INTO GoodStudent(full_name, dob, sex, phone, university_name, gradeLevel, gpa, bestWard_name) "
				+ "VALUES(?,?,?,?,?,?,?,?)";
		Connection connection = null;
		PreparedStatement statement =null;
		int result;
		try {
			connection = DatabaseConnection.getConnection();
			statement = connection.prepareStatement(sql);
			
			statement.setString(1, goodStudent.getFullName());
			statement.setDate(2, new java.sql.Date(goodStudent.getDob().getTime()));
			statement.setString(3, goodStudent.getSex());
			statement.setString(4, goodStudent.getPhone());
			statement.setString(5, goodStudent.getUniversityName());
			statement.setString(6, goodStudent.getGradeLevel());
			statement.setDouble(7, goodStudent.getGpa());
			statement.setString(8, goodStudent.getBestWardName());
			
			result = statement.executeUpdate();
			if (result > 0) return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	/***
	 * 	Phương thức cập nhật điểm cho sinh viên dựa theo số điện thoại tìm được
	 * @param goodStudent - nhập từ bàn phím
	 * @return
	 */
	public boolean updateGpaGoodStudentByPhone(GoodStudent goodStudent) {
		String sql = "UPDATE GoodStudent SET gpa = ? WHERE phone =? ";
		Connection connection  = null;
		PreparedStatement statement = null;
		try {
			connection = DatabaseConnection.getConnection();
			statement = connection.prepareStatement(sql);
			
			statement.setDouble(1, goodStudent.getGpa());
			statement.setString(2, goodStudent.getPhone());
			if(statement.executeUpdate() > 0) 
				return true;
			
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}
	
	/***
	 * Phương thức xóa 1 bản ghi trên Database
	 * Trả về true nếu xóa dc, và ngược lại false
	 */
	public boolean removeGoodStudentByphone(String phone) {
		String sql = "DELETE FROM GoodStudent WHERE phone =?";
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = DatabaseConnection.getConnection();
			statement = connection.prepareStatement(sql);
			
			statement.setString(1, phone);
			if (statement.executeUpdate() >0) {
				return true;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
}
