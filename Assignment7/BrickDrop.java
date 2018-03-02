import java.util.Scanner;
class BrickDrop {
     public static void main(String[] args){
        double g; // Gravity
        double d; // Distance in meter
        double t; // Time
        g = 32.174;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many seconds the brick falls.");
        t = sc.nextDouble();
        d=(1.0/2.0) * g * (t*t);
        System.out.println("Distance in feet = " + d);
        
    }
}