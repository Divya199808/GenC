
import java.util.Scanner;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the source");
        String source = sc.nextLine();
        System.out.println("Enter the destination");
        String destination = sc.nextLine();
        System.out.println("Enter the coach type");
        String coachType = sc.nextLine();
        if(!(coachType.equals("AC1") || coachType.equals("AC2") || coachType.equals("AC3")
                ||coachType.equals("Sleeper") || coachType.equals("Seater"))){
                 System.out.println("Invalid Coach Type");
                 return;
                }
        List<Train> trains = new TrainManagementSystem()
                    .viewTrain(coachType, source, destination);
        for(Train train: trains){
            System.out.println(train.getTrainNumber()+" "+train.getTrainName());
        }
        if(trains.size() <= 0){
            System.out.println("No trains found");
        }
	}
}
