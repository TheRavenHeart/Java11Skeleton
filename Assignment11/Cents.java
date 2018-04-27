import java.util.Scanner;
class Cents{
     public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int cents, Cents;
        System.out.println("Please enter how many cents you have."); // asks for how many cents
        cents = sc.nextInt();
        Cents = cents;
        cents = cents / 100; // gers the dollars
        while(Cents > 100){ // takes off 100 till its less then 100 so it makes the cents
            Cents = Cents - 100;
        }
        System.out.println("dollars: " + cents + " Cents: " + Cents );
    }
}

