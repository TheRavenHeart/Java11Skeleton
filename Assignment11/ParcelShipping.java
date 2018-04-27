import java.util.Scanner;
class ParcelShipping {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double width, height, depth, weight, Volume, TOTAL, OverC, ShippingC;
        boolean WEIGHT, VOLUME;
        ShippingC = 5;
        VOLUME = false; // Shipping cost for volume
        WEIGHT = false; // SHipping cost weight
        System.out.println("Please enter the width of the parcel.");
        width = sc.nextDouble(); // takes the width
        System.out.println("Please enter the height.");
        height = sc.nextDouble(); // takes the height
        System.out.println("Please enter the depth.");
        depth = sc.nextDouble(); // takes the dpeth
        Volume = width * height * depth; // decided the volume
        OverC = 0;
        if(Volume >= 25 ){ // if its over 25 then it makes the cost true
            VOLUME = true;
        }
        System.out.println("Please enter the weight in kilograms.");
        weight = sc.nextDouble();
        if (weight >= 5){ // if its over 5 it makes the wieght cost true
            WEIGHT = true;
        }
        if(VOLUME = true){ // the overcharge for whether volume
            OverC = OverC + 20;
        }
        if(WEIGHT = true){ // overcharge for weight
            OverC = OverC + 10;
        }
        System.out.println("You cost is: " + ShippingC + " + extra charge of: " + OverC); // pritns the normal charge + any overcharge
    }
}