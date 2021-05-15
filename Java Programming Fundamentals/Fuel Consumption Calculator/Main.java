import java.util.*;
import java.text.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double noLit,dist;
        System.out.println("Enter the no of liters to fill the tank");
        noLit = sc.nextDouble();
        test(noLit);
        System.out.println("Enter the distance covered");
        dist = sc.nextDouble();
        test(dist);
        calculateFuelConsumption(noLit,dist);
    }
    private static void test(double value){
        if(value <= 0){
            System.out.println((int) value + " is an Invalid Input");
            System.exit(0);
        }
    }
    private static void calculateFuelConsumption(double noLit,double dist){
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            double fuel = (noLit/dist)*100;
            double distK = (dist * 0.6214);
            double fuelC = (noLit * 0.2642);
            double miles = (distK / fuelC);
            System.out.println("Liters/100KM");
            System.out.println(decimalFormat.format(fuel));
            System.out.println("Miles/gallons");
            System.out.println(decimalFormat.format(miles));
        }
}
