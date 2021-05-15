import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of employees");
        int noOfEmployees = Integer.parseInt(sc.nextLine());
        List<Employee> empDetailsList = new ArrayList<>();
        System.out.println("Enter the employee details");
        while(noOfEmployees-- >0){
            String[] empDetails = sc.nextLine().split(":");
            empDetailsList.add(new Employee(empDetails[0],
                empDetails[1], Double.parseDouble(empDetails[2])));
        }
        ArrayList<Management> managementList = new ArrayList<>();
        System.out.println("Enter the number of times salary limit to be searched");
        int noOfSearches = Integer.parseInt(sc.nextLine());
        while(noOfSearches-- > 0){
            System.out.println("Enter the salary limit to be searched");
            double salaryLimit = Double.parseDouble(sc.nextLine());
            managementList.add(new Management(salaryLimit, empDetailsList));
        }
        try {
            for(int i=0; i<managementList.size(); ++i){
            Management mgmt = managementList.get(i);
            mgmt.run();
            mgmt.join();
            System.out.println(mgmt.getSalaryLimit() +":"+mgmt.getCount());
        }
        } catch(Exception e) {
        }
        sc.close();
	}
}
