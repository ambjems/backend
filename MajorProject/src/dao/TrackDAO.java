package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import app.DatabaseUtils;
import model.TrackModel;

public class TrackDAO {

public TrackModel Track(String trackId) {
		
		final TrackModel dataToBeSend = new TrackModel();
		
		try {
			Connection con = DatabaseUtils.initializeDatabase();
			
			Statement stmt = con.createStatement();
			
			String q = "SELECT * from queryandsugg where trackid = "+"\""+trackId+"\";";
			
			ResultSet result = stmt.executeQuery(q);

			if(result.next()) {
				dataToBeSend.setTrackId(result.getString(1));
				dataToBeSend.setStatus(result.getString(4));
			}
			else {
				dataToBeSend.setTrackId(trackId);
				dataToBeSend.setStatus("Sorry!! There are no such query/suggestions in our database with your track id. Please check your TRACK ID.");
			}

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return dataToBeSend;
	}
	
	
}
