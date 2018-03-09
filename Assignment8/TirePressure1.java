import java.util.Scanner;
class TirePressure1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double TireP1, TireP2, TireP3, TireP4;
    System.out.println("What is the front right tires pressure");
    TireP1 = sc.nextDouble();
    System.out.println("What is the front left tires pressure");
    TireP2 = sc.nextDouble();
    System.out.println("What is the back right tires pressure");
    TireP3 = sc.nextDouble();
    System.out.println("What is the back left tires pressure");
    TireP4 = sc.nextDouble();
    
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