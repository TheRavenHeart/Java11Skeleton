import java.util.Scanner;
class CreditCardBill  {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double mPayment, Balance, Intrest, TotalPayments;
        Balance = 1000;
        int Length, LengthT, Month;
        Intrest = 1.015;
        Month = 1;
        System.out.println("You have $1000 of debt to pay off on your credit card, please enter how much you would like to pay off per month.");
        mPayment = sc.nextInt();
        TotalPayments = 0;
        while(Balance >= 0){ 
            TotalPayments = TotalPayments + mPayment;
            int lengthOfThing = Double.toString(Month).length();  
            int lengthOfThingT = Double.toString(Balance).length(); // Tried to use these to get the exact line length I wanted, didn't work
            int lengthOfThingThr = Double.toString(TotalPayments).length();
            Length = lengthOfThing + lengthOfThingT + 7;
            Balance = Balance * Intrest; // Got the exact balance each month to pay off
            Balance = Balance - mPayment;
            System.out.print("Month: " + Month);
            LengthT = 16 + lengthOfThingThr;
            while(Length < 43){ // was trying to use this to make lines that were the same length, Didnt work
                System.out.print(" ");
                Length = Length + 1;
            }
            System.out.print("Balance: " + Balance);
            while(LengthT < 28){// was trying to use this to make lines that were the same length, Didnt work
                System.out.print(" ");
                LengthT = LengthT + 1;
            }
            System.out.println("total payments: " + TotalPayments); // prints out how many payments you've made
            Month = Month + 1; // adds to the month
        }
    }
}