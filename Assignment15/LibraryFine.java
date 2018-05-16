import java.util.Scanner;
class LibraryFine{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String Fine;
    String Message = "Fine is ";
    double Days = 1;
    double fine, Letter, Tfine;
    while(Days > 0){
    System.out.println("Enter days overdue.");
    Days = sc.nextDouble();
    sc.nextLine();
    if(Days == 0) {
        continue;
    }
    System.out.println("Enter the fine amount letter: ");
    Fine = sc.nextLine(); // sets the fine amount letter
    Fine = Fine.toUpperCase(); // Changes to upper case
    char FineChar = Fine.charAt(0); // changes 
    switch(FineChar){ // switches the end depending on what letter is entered abovev
        case 'A':
            fine = 0.10;
            break;
        case 'B':
            fine = 0.25;
            break;
        case 'C':
            fine = 0.50;
            break;
        case 'D':
            fine = 1.00;
            break;
        case 'E':
            fine = 2.00;
            break;
        case 'F':
            fine = 5.00;
            break;
        default:
            fine = 0;
            break;
    }
    Tfine = fine * Days;
    System.out.println("Your total fine is " + Tfine);
}
System.out.println("Bye");
}
}