import java.util.Scanner;
import java.util.stream.Stream;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter all roll numbers separated by comma");
		String data = sc.nextLine();
		System.out.println("Enter the department name acronym");
		String deptNameAcronym = sc.nextLine();
		Stream<String> rollNumbers = getRollNumbers(data);
		int count = getCount(rollNumbers, deptNameAcronym);
		if(count<=0){
		    System.out.println("No students from "+deptNameAcronym);
		} else {
		    System.out.println("Number of students in "+deptNameAcronym
		            +" is "+count);
		}
	}

	public static Stream<String> getRollNumbers(String rollNumbers) {
        return Stream.of(rollNumbers.split(","));
	}

	public static int getCount(Stream<String> rollNumberStream, String dept) {
        Iterator<String> iterator = rollNumberStream.iterator();
        int count = 0;
        while(iterator.hasNext()){
            String data = iterator.next();
            if(data.toLowerCase().startsWith(dept.toLowerCase())){
               count++; 
            }
        }
        return count;
	}

}
