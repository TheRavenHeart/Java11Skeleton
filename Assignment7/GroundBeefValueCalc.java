import java.util.Scanner;
class GroundBeefValueCalc {
    public static void main(String[] args) {
       double PrPerPackA, PerLeanPackA, PrPerPackB, PerLeanPackB, TotalPriceA, TotalPriceB;
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter the price per pound of package A");
       PrPerPackA = sc.nextDouble();
       System.out.println("Please enter the percent of lean in package A");
       PerLeanPackA = sc.nextDouble();
       System.out.println("Please enter the price per pound of package B");
       PrPerPackB = sc.nextDouble();
       System.out.println("Please enter the percent of lean in package B");
       PerLeanPackB = sc.nextDouble();
       
       
       TotalPriceA = 100/PerLeanPackA * PrPerPackA;
       TotalPriceB = 100/PerLeanPackB * PrPerPackB;
       
       System.out.println("Package A's cost per pound of lean is $" + TotalPriceA);
       System.out.println("Package B's cost per pound of lean is $" + TotalPriceB);
       if( TotalPriceA < TotalPriceB){
        System.out.println("Package A is the better deal.");
        }else { 
        System.out.println("Package B is the better deal.");
    }
    }
}