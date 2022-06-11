package edu.bu.met622.db.mysql;
import java.sql.*;


public class JDBCTest {
 
 private Connection con = null;	 
 public static void main(String[] args) { 
	try {
		JDBCTest jd = new JDBCTest();
		
		//jd.insert("tinytail","neighbor","persianCat", 'F');
		jd.delete("tinytail", "neighbor");
		jd.listAllPets();
	}catch (Exception ex){
		ex.printStackTrace();
	}
 }
 public void listAllPets() throws Exception{ 

	 try {
		// I add this "?useTimezone=true&serverTimezone=UTC" because of time zone error
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/met622?useTimezone=true&serverTimezone=UTC","root","root");  
		System.out.println("--->" + con.toString());
		Statement stmt = con.createStatement();  
		ResultSet rs = stmt.executeQuery("select * from pet");  
		while(rs.next())  {
			System.out.println("row: "+rs.getString(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4));  
		} 

	}catch (Exception ex){
		ex.printStackTrace();
	}
	 finally {
		con.close(); 
	 }
 }
 
 // "tinytail","neighbor","persian cat", "F"
 private void insert(String name, String owner,String race, Character gender) {
	 try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/met622?useTimezone=true&serverTimezone=UTC","root","root");  
			// System.out.println("--->"+con.getMetaData()....);
			Statement stmt = con.createStatement();  
			System.out.println("----->"+ "INSERT INTO Pet(name,owner,species,sex) VALUES ('"
											+name+"','"+owner+"','"+race+"','"+gender+"')");
			stmt.executeUpdate("INSERT INTO Pet(name,owner,species,sex) VALUES ('"+ name +"','"+ owner +"','"+ race +"','"+ gender +"')");  
			con.close();
	 }catch (Exception ex) {
       ex.printStackTrace();
	 }
 }
 
 private void delete(String name, String owner) {
	 try {
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/met622?useTimezone=true&serverTimezone=UTC","root","root");  
		 System.out.println("--->"+con.toString());
		 Statement stmt = con.createStatement();  
		 System.out.println("----->"+"DELETE FROM Pet WHERE name='"+name+"' AND owner='"+owner+"'");
		 stmt.executeUpdate("DELETE FROM Pet WHERE name='"+name+"' AND owner='"+owner+"'");  
		 con.close();
	 } catch (Exception ex) {
	    ex.printStackTrace();
	 }
 }
 
}
