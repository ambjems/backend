package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import app.DatabaseUtils;
import model.RecoModeModel;

public class SpecoModeDAO {
	
public List<RecoModeModel> SpecoMode(String name) {
		
		final List<RecoModeModel> dataToBeSend = new ArrayList<RecoModeModel>();
		
		try {
			Connection con = DatabaseUtils.initializeDatabase();
			
			Statement stmt = con.createStatement();
			
			String q = "SELECT * from school_details where school_name = "+"\""+name+"\""+";";
			
			ResultSet result = stmt.executeQuery(q);

			while(result.next()) {							
				double fee[] = new double[15];
				fee[0] = Integer.parseInt(result.getString(5));
				fee[1] = Integer.parseInt(result.getString(6));
				fee[2] = Integer.parseInt(result.getString(7));
				fee[3] = Integer.parseInt(result.getString(8));
				fee[4] = Integer.parseInt(result.getString(9));
				fee[5] = Integer.parseInt(result.getString(10));
				fee[6] = Integer.parseInt(result.getString(11));
				fee[7] = Integer.parseInt(result.getString(12));
				fee[8] = Integer.parseInt(result.getString(13));
				fee[9] = Integer.parseInt(result.getString(14));
				fee[10] = Integer.parseInt(result.getString(15));
				fee[11] = Integer.parseInt(result.getString(16));
				fee[12] = Integer.parseInt(result.getString(17));
				fee[13] = Integer.parseInt(result.getString(18));
				fee[14] = Integer.parseInt(result.getString(19));
				
				RecoModeModel rows = new RecoModeModel(result.getString(2),
								result.getString(3),result.getString(4), fee);
						
						
				dataToBeSend.add(rows);
					

			}
				 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return dataToBeSend;
	}

}
