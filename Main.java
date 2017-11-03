package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//getConnection();
		createTable();
		post();
	}
	
	public static void post()throws Exception{
		final String var1= "John";
		final String var2= "Miller";
		try{
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO Guest(First, Last) VALUES ('" + var1 + "','" + var2 + "' )");
			
			posted.executeUpdate();
		}catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("Insert Completed");
		}
	}

	public static void createTable() throws Exception{
		try{
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS Guest(ID int NOT NULL AUTO_INCREMENT, First varchar(255),"
					+ "Last varchar(255), PRIMARY KEY(ID))");

			create.executeUpdate();

		}catch (Exception e){
			System.out.println(e);
		} finally{
			System.out.println("Function is Complete");
		}
	}


	public static Connection getConnection () throws Exception{
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://sql9.freesqldatabase.com:3306/sql9202621";
			String username = "sql9202621";
			String password = "BfdXwG8yyL";
			Class.forName(driver);

			Connection conn = DriverManager.getConnection(url,username,password);
			System.out.println("Connected");

			return conn;
		} catch (Exception e){
			System.out.println(e);
		}
		return null;
	}
}
