package ANSEN;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class Database {
	static Connection con=null;
	static PreparedStatement pst=null;
	static ResultSet rs = null;
	public static void main(){
			
	}
	
	public static boolean getConnection(){
		boolean flag=true;
		String url = "jdbc:mysql://sql9.freesqldatabase.com:3306/sql9204235";
		String username = "sql9204235";
		String password = "jCw1WuPPcU";
		String driver = "com.mysql.jdbc.Driver";
		try{
			con = DriverManager.getConnection(url,username,password);
			Class.forName(driver);
		}catch(Exception connect){
			JOptionPane.showMessageDialog(null, connect);
			flag =false;
			}
		
		return flag;
	}
	
	public static PreparedStatement getData(String ID){
		try{
			String sql ="SELECT FirstName, MiddleName, LastName, DOB, Phone, Email, "
					+ "Adult, Children, CheckIN, CheckOUT, typeRoom FROM ANSENHotelV2 WHERE ID=?";
			pst = con.prepareStatement(sql);
			pst.setString(1, ID);
			return pst;
		}catch(Exception el){
			JOptionPane.showMessageDialog(null, el);
		}
		return pst;
		
	}
	public static PreparedStatement insertData(){
		try{
			String sql ="INSERT INTO ANSENHotelV2(FirstName, MiddleName, LastName, DOB, Phone, Email, "
					+ "Adult, Children, CheckIN, CheckOUT, ID,typeRoom)"
					+ " VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
			pst=con.prepareStatement(sql);
		}catch(Exception el){
			JOptionPane.showMessageDialog(null, el);
		}
		
		return pst;
	}
	public static PreparedStatement deleteData(String ID){
		try{
			String sql ="DELETE FROM ANSENHotelV2 WHERE ID=?";
			pst=con.prepareStatement(sql);
			pst.setString(1,ID);
		}catch(Exception el){
			JOptionPane.showMessageDialog(null, el);
		}
		return pst;
	}
	public static PreparedStatement updateData(){
		try{
			String sql ="UPDATE ANSENHotelV2 SET FirstName=?,MiddleName=?,LastName=?,DOB=?,Phone=?,"
					+ "Email=?,Adult=?,Children=?,CheckIN=?,CheckOUT=?  WHERE ID=?";
			pst=con.prepareStatement(sql);
		}catch(Exception el){
			JOptionPane.showMessageDialog(null, el);
		}
		return pst;
	}

}