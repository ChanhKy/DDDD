package fa.training.comman;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private static String HOSTNAME = "localhost";
	private static String PORT = "1433";
	private static String DATABASE = "LamLaiFinalExample";
	private static String USER = "sa";
	private static String  PW = "123123";
	
	public static Connection getConnection() {
		Connection connection = null;
		
		try {
			String url = "jdbc:sqlserver://" + HOSTNAME + ":" + PORT + ";databaseName=" + DATABASE;
			
			connection = DriverManager.getConnection(url, USER, PW);
			System.out.println("ket Noi Thanh Cong");
		} catch (SQLException e) {
			System.out.println("Kết nối thất bại.");
			e.printStackTrace();
		}
		
		return connection;
	}
}
