import java.util.Scanner;
class OrderChecker {
     public static void main(String[] args){
         double NoB, NoN, NoW, PoB, PoN, PoW, TPoB, TPoN, TPoW, twoNoB, totalPrice;
         PoB = 0.05;
         PoN = 0.03;
         PoW = 0.01;
         System.out.println("How many bolts would you like to purchase for 5 cents each?");
         Scanner sc = new Scanner(System.in);
         NoB = sc.nextDouble();
         System.out.println("How many nuts would you like to purchase for 3 cents each?");
         NoN = sc.nextDouble();
         System.out.println("How many washers would you like to purchase for 1 cent each?");
         NoW = sc.nextDouble();
         System.out.println("Number of bolts " + NoB);
         System.out.println("Number of nuts " + NoN );
         System.out.println("Number of washers " + NoW);
         totalPrice = ((NoB * PoB) + (NoN * PoN) + (NoW * PoW));
         twoNoB = NoB * 2;
         if(NoN < NoB ){
         System.out.println("Check the order: too few nuts.");   
         }
         if(NoW < twoNoB){
         System.out.println("Check the order: Too few washers.");   }
         
         System.out.println("Your order will cost $" + totalPrice);
        }
    }