import java.util.*;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the minimum height");
        double minHeight = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the maximum weight");
        double maxWeight = Double.parseDouble(sc.nextLine());
        List<String> playerList = new PlayerSelectionSystem()
                    .playersBasedOnHeightWeight(minHeight, maxWeight);
        if(playerList.size()<=0){
            System.out.println("No players are with minimum height of "+minHeight+" and maximum weight of "+maxWeight);
        } else {
            for(String playerName: playerList){
                System.out.println(playerName);
            }
        }
        sc.close();
	}
}
