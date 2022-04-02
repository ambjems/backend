package app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class InsertIntoDB {

	//JDBC Driver and DB URL
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql:// localhost:3306/major-project";
	
	// Database Credentials
	static final String USER = "root";
	static final String PASS = "Ambuj@58";
	
	//Reading CSV
	private static ArrayList<SchoolDetails> schools;
	public static ArrayList<SchoolDetails> readCsv(String filepath) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(filepath));
			schools = new ArrayList<SchoolDetails>();
			String line = null;
			
			// Skips 21 first line as it contains column name
			for(int i=0;i<=20;i++) {
				reader.readLine();
			}
			
			while((line = reader.readLine()) != null) {
				   String[] data = line.split(",");
				    
				   if(data.length > 0) {
					   SchoolDetails tp = new SchoolDetails();
					   tp.setId(data[0]);
					   tp.setSchool_name(data[1]);
					   tp.setState(data[2]);
					   tp.setBoard(data[3]);
					   tp.setNursery(data[4]);
					   tp.setLkg(data[5]);
					   tp.setUkg(data[6]);
					   tp.setClass1(data[7]);
					   tp.setClass2(data[8]);
					   tp.setClass3(data[9]);
					   tp.setClass4(data[10]);
					   tp.setClass5(data[11]);
					   tp.setClass6(data[12]);
					   tp.setClass7(data[13]);
					   tp.setClass8(data[14]);
					   tp.setClass9(data[15]);
					   tp.setClass10(data[16]);
					   tp.setClass11(data[17]);
					   tp.setClass12(data[18]);
					   schools.add(tp);
					   }
				   }
		
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return schools;
	}
	
	static long startTime = System.currentTimeMillis();
	static int count = 0;

	
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement stmt = null;
		Statement stmt1 = null;
		String filepath = "C:\\Users\\ambjems\\Documents\\School_Details.csv";
		
		try {
			//Registering JDBC driver	
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Opening a connection
		    System.out.println("Connecting to your database. Please wait !!!");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			System.out.println("Connected  successfully to your database.");
			
			conn.setAutoCommit(false);
			
			String sql1 = "DELETE FROM school_details";
			stmt1 = conn.createStatement();
			stmt1.executeUpdate(sql1);
			
			//Executing Query
			System.out.println("Inserting records into the table...");
			String sql = "insert into school_details(id, school_name, state, board, nursery, lkg, ukg, class1, class2, class3, class4, class5, class6, class7, class8, class9, class10, class11, class12) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?); ";
			stmt = conn.prepareStatement(sql);
			
			
			//Storing result in ArrayList 
			ArrayList<SchoolDetails> list = readCsv(filepath) ;
			for (SchoolDetails obj: list) {
				String id = obj.getId();
				String school_name = obj.getSchool_name();
				String state = obj.getState();
				String board = obj.getBoard();
				String nursery = obj.getNursery();
				String lkg = obj.getLkg();
				String ukg = obj.getUkg();
				String class1 = obj.getClass1();
				String class2 = obj.getClass2();
				String class3 = obj.getClass3();
				String class4 = obj.getClass4();
				String class5 = obj.getClass5();
				String class6 = obj.getClass6();
				String class7 = obj.getClass7();
				String class8 = obj.getClass8();
				String class9 = obj.getClass9();
				String class10 = obj.getClass10();
				String class11 = obj.getClass11();
				String class12 = obj.getClass12();
				
				stmt.setString(1, id);
				stmt.setString(2, school_name);
				stmt.setString(3, state);
				stmt.setString(4, board); 
				stmt.setString(5, nursery);
				stmt.setString(6, lkg);
				stmt.setString(7, ukg);
				stmt.setString(8, class1); 
				stmt.setString(9, class2);
				stmt.setString(10, class3);
				stmt.setString(11, class4);
				stmt.setString(12, class5); 
				stmt.setString(13, class6);
				stmt.setString(14, class7);
				stmt.setString(15, class8);
				stmt.setString(16, class9); 
				stmt.setString(17, class10);
				stmt.setString(18, class11);
				stmt.setString(19, class12);

			stmt.executeUpdate();
			count++;
			conn.commit();			
		}
	}	
		catch (SQLException se) {
			se.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 

		finally {
			try {
				if (stmt!=null)
					stmt.close();
			}
			catch(SQLException se2) {
			}//nothing to do
			
			try{
				if (conn!=null)
					conn.close();
			}
			catch (SQLException se) {
				se.printStackTrace();
			}
		}
		
		long endTime = System.currentTimeMillis();
		long timeElapsed = (endTime - startTime);
		System.out.println(count+" Records affected");
		System.out.println("Time Elapsed is: "+timeElapsed+" milliseconds");
		
		System.out.println("Thanks for using our program.");
	}
	
}
