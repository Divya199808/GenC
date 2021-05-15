
import java.util.ArrayList;
import java.sql.*;

public class TrainManagementSystem {
	
	public ArrayList <Train> viewTrain (String coachType, String source, String destination){
		ArrayList<Train> trainList = new ArrayList<>();
		try {
		    Connection conn = DB.getConnection();
		    Statement statement = conn.createStatement();
		    String sql = "select train_number, train_name"
		               + " from train where source = '"+source + "'"
		               + " and destination = '"+destination+"'"
		               + " and "+coachType.toLowerCase()+" > 0"
		               + " order by train_number;";
		    ResultSet result = statement.executeQuery(sql);
		    while(result.next()){
		        Train train = new Train();
		        train.setTrainNumber(result.getInt(1));
		        train.setTrainName(result.getString(2));
		        trainList.add(train);
		    }
		    statement.close();
		    conn.close();
		} catch(Exception e) {
		}	
		return trainList;
		
	}

}
