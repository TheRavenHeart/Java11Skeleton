import java.util.Scanner;
class ShippingCalc {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in); 
        double weight, Handiling, Costweight, sum, num;
        Costweight = 0.25;
        sum = 0;
        Handiling = 3.00;
        System.out.println("Enter the weight of the object that you would like to be shipped");
        weight = sc.nextDouble();
        num = 0;
        if(weight > 10){
            num = (weight - 10) * Costweight;
            sum = num + sum;
        }
        System.out.println("Shipping cost $" + (sum + Handiling));
        
        while(!(weight == 0)){
            System.out.println("Enter the weight of the object that you would like to be shipped, press 0 if you would like to stop");
            weight = sc.nextDouble();
            if(weight > 10){
            num = (weight - 10) * Costweight;
            sum = num + sum;
        } else {
        sum = 0;
    }
        System.out.println("Shipping cost $" + (sum + Handiling));
        sum = 0;
        }
        System.out.println("Bye...");
        }
    }
