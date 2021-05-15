import java.util.*;
public class Main{
    public static void main (String[] args) {
        try{
            Candidate c1=Main.getCandidateDetails();
            if(!c1.equals(null))
                System.out.println("Registration Successful");
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public static Candidate getCandidateDetails() throws InvalidSalaryException{
        Scanner sc = new Scanner(System.in);
        Candidate obj = new Candidate();
        System.out.println("Enter the candidate Details");
        System.out.println("Name");
        String name = sc.nextLine();
        System.out.println("Gender");
        String gender=sc.nextLine();
        System.out.println("Expected Salary");
        double salary = sc.nextDouble();
        
        if(salary < 10000){
            throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
        }
        
        else{
            obj.setName(name);
            obj.setGender(gender);
            obj.setExpectedSalary(salary);
            return obj;
        }
    }
}
