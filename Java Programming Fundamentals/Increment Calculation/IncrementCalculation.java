import java.util.Scanner;
class IncrementCalculation{
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int total;
        System.out.println("Enter the salary");
        Integer salary = in.nextInt();
        System.out.println("Enter the Performance appraisal rating");
        Float rating = in.nextFloat();
        if(salary <= 0 || rating < 1.0 || rating > 5.0){
            System.out.println("Invalid Input");
        }
        else {
            if(rating >= 1 && rating <= 3){
                total = salary + (salary*10/100);
                System.out.println(total);

            }
            else if(rating >= 3.1 && rating <= 4.0){
                total = salary + (salary*25/100);
                System.out.println(total);
            }
            else{
                total = salary + (salary*30/100);
                System.out.println(total);
            }
        }
    }
}
