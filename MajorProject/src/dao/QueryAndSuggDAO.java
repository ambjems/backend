package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import app.DatabaseUtils;
import model.QueryAndSuggModel;

public class QueryAndSuggDAO {

public QueryAndSuggModel QueryAndSugg(String trackId, String type, String words) {
		
		final QueryAndSuggModel dataToBeSend = new QueryAndSuggModel();
		
		try {
			Connection con = DatabaseUtils.initializeDatabase();
			
			String q = "INSERT into queryandsugg VALUES(?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(q);
			
			stmt.setString(1, trackId);
			stmt.setString(2, type);
			stmt.setString(3, words);
			stmt.setString(4, "Accepted");
			
			int i = stmt.executeUpdate(); 
			
			if(i>0) {
				dataToBeSend.setTrackId(trackId);
				dataToBeSend.setMessage("Query/Suggestion received successfully. Please take the screenshot of TRACK ID and go to our track page to track the progress of your query and suggestions.");
			}
			else {
				dataToBeSend.setTrackId(trackId);
				dataToBeSend.setMessage("Sorry!! We can't accept your query/suggestion.");
			}
			
		}
				
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return dataToBeSend;
	}
	
	
}
