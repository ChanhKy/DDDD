package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private static String HOSTNAME = "localhost";
	private static String PORT = "1433";
	private static String DATABASE = "LamLaiExFinal";
	private static String USER = "sa";
	private static String  PW = "123123";
	
	public static Connection getConnection() {
		Connection connection = null;
		try {
			String url = "jdbc:sqlserver://" + HOSTNAME + ":" + PORT + ";databaseName=" + DATABASE;
			connection = DriverManager.getConnection(url, USER, PW);
			System.out.println("ket noi thanh cong");
		} catch (SQLException e	 ) {
			System.out.println("Ket noi that bai");
			e.printStackTrace();
		}
		return connection;
	}
	
}
