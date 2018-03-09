import java.util.Scanner;
class TirePressure2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double TireP1, TireP2, TireP3, TireP4;
    boolean GoodTirePressure;
    GoodTirePressure = true;
    System.out.println("What is the front right tires pressure");
    TireP1 = sc.nextDouble();
    if(TireP1 < 35 || TireP1 > 45){
        System.out.println("Warning: pressure is out of range");
        GoodTirePressure = false;
    }
    System.out.println("What is the front left tires pressure");
    TireP2 = sc.nextDouble();
    if(TireP2 < 35 || TireP2 > 45){
        System.out.println("Warning: pressure is out of range");
        GoodTirePressure = false;
    }
    System.out.println("What is the back right tires pressure");
    TireP3 = sc.nextDouble();
    if(TireP3 < 35 || TireP3 > 45){
        System.out.println("Warning: pressure is out of range");
        GoodTirePressure = false;
    }
    System.out.println("What is the back left tires pressure");
    TireP4 = sc.nextDouble();
    if(TireP4 < 35 || TireP4 > 45){
        System.out.println("Warning: pressure is out of range");
        GoodTirePressure = false;
    }
    
    if(GoodTirePressure == false){
        System.out.println("Inflation is BAD");
    } else{ 
        if(TireP1 == TireP2){
        if(TireP3 == TireP4){
            System.out.println("Inflation is OK.");
        } else{
            System.out.println("Tire Pressure is not equal please equalize your tires");
        }
    }else {
        System.out.println("Tire Pressure is not equal please equalize your tires");
    }
        
    }
    
}
}