import java.util.Scanner;
class ParcelShipping {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double width, height, depth, weight, Volume, TOTAL, OverC, ShippingC;
        boolean WEIGHT, VOLUME;
        ShippingC = 5;
        VOLUME = false;
        WEIGHT = false;
        System.out.println("Please enter the width of the parcel.");
        width = sc.nextDouble();
        System.out.println("Please enter the height.");
        height = sc.nextDouble();
        System.out.println("Please enter the depth.");
        depth = sc.nextDouble();
        Volume = width * height * depth;
        OverC = 0;
        if(Volume >= 25 ){
            VOLUME = true;
        }
        System.out.println("Please enter the weight in kilograms.");
        weight = sc.nextDouble();
        if (weight >= 5){
            WEIGHT = true;
        }
        if(VOLUME = true){
            OverC = OverC + 20;
        }
        if(WEIGHT = true){
            OverC = OverC + 10;
        }
        System.out.println("You cost is: " + ShippingC + " + extra charge of: " + OverC);
    }
}