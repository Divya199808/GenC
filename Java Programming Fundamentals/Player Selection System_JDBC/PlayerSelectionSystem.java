import java.util.List;
import java.util.*;
import java.sql.*;

public class PlayerSelectionSystem {

	public List<String> playersBasedOnHeightWeight (double minHeight, double maxWeight){
		List<String> playerList = new ArrayList<String>();
        try {
            Connection conn = DB.getConnection();
            Statement statement = conn.createStatement();
            
            String sql = "select playerName from player where"
                         + " height >= "+minHeight
                         + " and weight <= "+maxWeight 
                         + ";";
            ResultSet result = statement.executeQuery(sql);
            while(result.next()){
                playerList.add(result.getString(1));
            }
            Collections.sort(playerList);
            conn.close();
            statement.close();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
		return playerList;
	}
}
