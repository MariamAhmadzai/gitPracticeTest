package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtilities {

	// Creating private static object of Connection class
	private static Connection conn;

	// Creating private static Objet of Statement class
	private static Statement stmt;

	// Creating private static object of resultSet class
	// It is used to create a resultset to store queryr result
	private static ResultSet resultSet;

	// create Database URL
	private static String dbURL = "jdbc:postgresql://localhost:5432/dvdrental";
	private static String dbUserName = "postgres";
	private static String dbPassword = "root";

	public static void setupConnection() { // Create connection between DB and selenium

		try {
			conn = DriverManager.getConnection(dbURL, dbUserName, dbPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static ResultSet runQuery(String query) {

		try {
			stmt = conn.createStatement();
			resultSet = stmt.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultSet;
	}

	public static void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
			}
		}

	}

	public void writeResultToCSV() {

	}

}