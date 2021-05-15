import java.util.Scanner;  

public class SnacksDetails {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  
    System.out.println("Enter the no of pizzas bought:");
    Integer pizza = myObj.nextInt();
    System.out.println("Enter the no of puffs bought:");
    Integer puff = myObj.nextInt();
    System.out.println("Enter the no of cool drinks bought:");
    Integer cool = myObj.nextInt();
    int total = (pizza * 100) + (20 * puff) + (10 * cool);
    System.out.println("Bill Details");
    System.out.println("No of pizzas:" +pizza);
    System.out.println("No of puffs:" +puff);  
    System.out.println("No of cooldrinks:" +cool);
    System.out.println("Total price:" +total); 
    System.out.println("ENJOY THE SHOW!!!");  
  }
}
