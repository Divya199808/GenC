import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	
	private static Map <String,Double> employeeMap = new HashMap<>();

	public Map<String, Double> getEmployeeMap() {
		return employeeMap;
	}

	public void setEmployeeMap(Map<String, Double> employeeMap) {
		this.employeeMap = employeeMap;
	}
	
	public void addEmployeeDetails(String employeeName, double salary)
	{
		employeeMap.put(employeeName, salary);
	}
	
	
	
	public static EmployeeAudit findEmployee()
	{
		ArrayList<String> name = new ArrayList<>();
	    return (salary) -> {
	    	for(Entry<String, Double> entry: employeeMap.entrySet()) {
	    		if(entry.getValue() <= salary) {
	    			name.add(entry.getKey());
	    		}
	    	}
			return name;};
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		while(true){
		    System.out.println("1.Add Employee Details\r\n"
    			+ "2.Find Employee Details\r\n"
    			+ "3.Exit\r\n"
    			+ " Enter the choice");
    		String choice = sc.nextLine();
    		if(choice.equals("1")){
    		    System.out.println("Enter the Employee name");
    		    String employeeName = sc.nextLine();
    		    System.out.println("Enter the Employee Salary");
    		    double salary = Double.parseDouble(sc.nextLine());
    		    new Main().addEmployeeDetails(employeeName, salary);
    		} else if(choice.equals("2")){
    		    System.out.println("Enter the salary to be searched");
    		    double salary = Double.parseDouble(sc.nextLine());
    		    System.out.println("Employee List");
    		    List<String> employeeNames = findEmployee().
    		        fetchEmployeeDetails(salary);
    		    if(employeeNames.size() != 0){
    		        employeeNames.forEach(System.out::println);
    		    } else {
    		        System.out.println("No Employee Found");
    		    }
    		} else if(choice.equals("3")){
    		    System.out.println("Let's complete the session");
    		    break;
    		}
		}
	}

}
