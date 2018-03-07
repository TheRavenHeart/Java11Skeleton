import java.util.Scanner;
class LastChanceGas {
    public static void main(String[] args) {
        double gasTank, Gage, MPG, Miles, AGage, gasTankCurr, distanceGo;
        Scanner sc = new Scanner(System.in);
        Miles = 200;
        System.out.println("Al's Last Chance Gas station sits on Route 190 on the edge of Death Valley. There is no other gas station for 200 miles This program will tell you if you can make it or not.");
        System.out.println("How many gallons can your car hold.");
        gasTank = sc.nextDouble();
        System.out.println("What does your gas gage say the tank's percentage of gas is now.");
        Gage = sc.nextDouble();
        System.out.println("How many miles can your car go per gallon?");
        MPG = sc.nextDouble();
        AGage = ((Gage / 100) * gasTank);
        gasTankCurr = gasTank / AGage;
        distanceGo = gasTankCurr * MPG;
        if(distanceGo >= Miles){
            System.out.println("You can get there to your destination safely.");
        } else {
            System.out.println("You cannot reach your destination you must get gas.");
        }
    }
}