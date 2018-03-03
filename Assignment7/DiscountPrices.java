import java.util.Scanner;
class DiscountPrices {
     public static void main(String[] args){
         double Price, DiscountedPrice, DiscountedTotal;
         System.out.println("Please enter the price of what you are buying");
         Scanner sc = new Scanner(System.in);
         Price = sc.nextDouble();
         DiscountedTotal = Price * 0.10;
         DiscountedPrice = Price - DiscountedTotal;
         
         
         
         if(Price > 10.00){
         System.out.println("Your Discounted total is $" + DiscountedPrice);
        }else{
         System.out.println("Your total is $" + Price);    
        }
         
        }
    }