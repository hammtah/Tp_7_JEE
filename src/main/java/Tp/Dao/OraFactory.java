package Tp.Dao;
import Tp.Dao.interfaces.*;
import Tp.Dao.implementation.*;
import java.sql.DriverManager;
import java.sql.*;

//Cette class est reponsable à l'etablissement de connection, ainsi la creation des differents 'objets DAO'. 
//Ces objets DAO retournés sont les implementations des interfaces situé dans Tp.Dao.interfaces.  
//Ces interfaces contiennet les definitions des methodes de manipulation des <tableaux> de notre BD. 
//donc ça permet l'isolation, puisque les methodes de manipulation des tables sont 
//independants de l'implementation .
//Cette methodologie devient envore plus utile quand vous travailler avec plusieurs SGBD   
public class OraFactory {
	public static final String driver="oracle.jdbc.driver.OracleDriver";
	public static final String dbUrl="jdbc:oracle:thin:testpractice/Test123@//localhost:1521/xepdb1";


public static Connection getConnection() throws SQLException{
	try {
		Class.forName(driver);
	}catch(ClassNotFoundException ec) {}
	
	return DriverManager.getConnection(dbUrl);

}

public static UserDao getUserDao() {
	return new UserDaoImpl();
}

}