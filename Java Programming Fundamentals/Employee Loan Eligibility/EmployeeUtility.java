import java.util.stream.Stream;
import java.util.Iterator;

public class EmployeeUtility {

	public Employee[] getEmployeeDetails(String[] details) {
        
        Employee[] employees = new Employee[details.length];
        for(int i=0; i<details.length; ++i){
            Employee employee = new Employee();
            String[] employeeString = details[i].split(";");
            employee.setEmpId(employeeString[0]);
            employee.setEmpName(employeeString[1]);
            employee.setSalary(Double.parseDouble(employeeString[2]));
            employees[i] = employee;
        }
        return employees;
	}

	public Stream<Employee> getStreamOfEmployee(Employee[] empDetails) {
        return Stream.of(empDetails);
	}

	public String[] shortlistedEmployee(Stream<Employee> empStream,double minSalary) {
        String outputString = "";
        boolean isEmpty = true;
        empStream = empStream.sorted((e1,e2)->e1.getEmpId().compareTo(e2.getEmpId()));
        Iterator<Employee> employees = empStream.iterator();
        while(employees.hasNext()){
         Employee obj = employees.next();
         if(obj.getSalary() >= minSalary){
             isEmpty = false;
            outputString += obj.getEmpId() +" "+ obj.getEmpName() +" "+ obj.getSalary() + ";";}
        }
        return isEmpty? new String[0] : outputString.split(";");
	}

}
