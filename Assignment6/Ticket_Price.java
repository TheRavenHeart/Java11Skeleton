import java.util.Scanner;
class Ticket_Price {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String movie;
        Double Ticket_Price, Number_of_tickets, Total_Price;

        System.out.println("Enter what movie you wish to see.");
        movie = scan.nextLine();
        System.out.println("Enter the number of tickets you would like.");
        Number_of_tickets = scan.nextDouble();
        System.out.println("Enter the price of the tickets.");
        Ticket_Price = scan.nextDouble();
        
        Total_Price = Ticket_Price * Number_of_tickets;

        System.out.println("The price of the tickets is " + Total_Price + " for " + Number_of_tickets);
    }
}