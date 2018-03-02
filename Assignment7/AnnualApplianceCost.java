import java.util.Scanner;
class AnnualApplianceCost {
     public static void main(String[] args){
        double kwh;
        double hour;
        double totalcost ;
        double cost;
        
        System.out.println("Please enter the cost per kilo-watt-hours in cents.");
        Scanner sc = new Scanner(System.in);
        cost = sc.nextDouble();
        System.out.println("Please enter the number of hours you use it.");
        hour = sc.nextDouble();
        totalcost = hour * cost;
        System.out.println("The Annual cost is " + totalcost + "cents");
        
        
    }
}