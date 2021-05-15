import java.util.*;
public class UserInterface {
    
    public static CommissionInfo generateCommissionObtained (){
        return (ticketObj) -> {
            if(ticketObj.getClassType().equalsIgnoreCase("1A") || ticketObj.getClassType().equalsIgnoreCase("2A")
                        || ticketObj.getClassType().equalsIgnoreCase("3A")){
                            return 100.0;
                        } else {
                            return 60.0;
                        }
        };

    }
    
   public static void main(String args[]) {
        
    // Fill the code here
    Scanner sc = new Scanner(System.in);
     System.out.println("Enter the no of passengers");
        int noOfPassengers = Integer.parseInt(sc.nextLine());
        Ticket[] tickets = new Ticket[noOfPassengers];
        double commission = 0.0;
        for (int i=1;i<=noOfPassengers ;i++ ) {
            System.out.println("Details of Passenger "+i+":");
            System.out.println("Enter the pnr no:");
            long pnrNo = Long.parseLong(sc.nextLine());
            System.out.println("Enter passenger name:");
            String passengerName = sc.nextLine();
            System.out.println("Enter seat no:");
            int seatNo = Integer.parseInt(sc.nextLine());
            System.out.println("Enter class type:");
            String classType = sc.nextLine();
            System.out.println("Enter ticket fare:");
            double ticketFare = Double.parseDouble(sc.nextLine());
            tickets[i-1] = new Ticket(pnrNo,passengerName,seatNo,classType,ticketFare);
        }
        CommissionInfo info = generateCommissionObtained();
        for(Ticket ticketObj: tickets){
            commission += info.calculateCommissionAmount(ticketObj);
        }
        System.out.printf("Commission Obtained\nCommission obtained per each person: Rs.%.2f", commission);

    
    }
    
}
