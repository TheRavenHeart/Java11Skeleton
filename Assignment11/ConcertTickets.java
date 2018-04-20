import java.util.Scanner;
class ConcertTickets  {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double tPrice, Gst, Pst, Subtotal, Total, gstT, pstT;
        int tickets, True;
        True = 1;
        
        while(True == 1){
        System.out.println("What is the ticket price?");
        tPrice = sc.nextDouble();
        System.out.println("How many tickets would you like to purchase?");
        tickets = sc.nextInt();
        Pst = 0.6;
        Gst = 0.7;
        Subtotal = tickets * tPrice;
        gstT = Subtotal * Gst;
        pstT = Subtotal * Pst;
        Total = Subtotal + pstT + gstT;
        System.out.println("Your subtotal is: " + Subtotal + " + pst: " + pstT + " + gst: " + gstT );
        System.out.println("Your total is: " + Total);
        System.out.println("Would you like to continue, press 1 if so and 0 if not");
        True = sc.nextInt();
        
    }
    System.out.println("Thanks for using my code, please come again.");
    }
}