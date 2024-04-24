package Tp.Dao;

import java.sql.DriverManager;
import java.sql.*;

public class OraFactory {
	public static final String driver="oracle.jdbc.driver.OracleDriver";
	public static final String dbUrl="jdbc:oracle:thin:@//localhost:1521:xepdb1";
	Connection conn = null;

public Connection getConnection() {
	try {
		Class.forName(driver);
	}catch(ClassNotFoundException ec) {}
	
	try {
		conn =  DriverManager.getConnection(dbUrl, "system", "clarence");
	}catch(SQLException se) {}
	
	return conn;
}

}