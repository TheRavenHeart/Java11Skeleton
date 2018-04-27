import java.util.Scanner;
class ConcertTickets  {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double tPrice, Gst, Pst, Subtotal, Total, gstT, pstT;
        int tickets, True;
        True = 1;
        
        while(True == 1){
        System.out.println("What is the ticket price?");
        tPrice = sc.nextDouble(); // sees what the price is
        System.out.println("How many tickets would you like to purchase?");
        tickets = sc.nextInt(); // check the amount of tickets
        Pst = 0.6; // each of the types of taxes
        Gst = 0.7;
        Subtotal = tickets * tPrice;    // subtotal
        gstT = Subtotal * Gst;// the extra gst
        pstT = Subtotal * Pst; // the extra pst
        Total = Subtotal + pstT + gstT; // total price
        System.out.println("Your subtotal is: " + Subtotal + " + pst: " + pstT + " + gst: " + gstT ); // pritns out seperatly 
        System.out.println("Your total is: " + Total);// prints out all together
        System.out.println("Would you like to continue, press 1 if so and 0 if not");
        True = sc.nextInt();
        
    }
    System.out.println("Thanks for using my code, please come again.");
    }
}