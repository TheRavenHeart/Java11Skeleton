import java.util.Scanner;

class ComboLock {
    public static void main(String[] args) {
        int lockFirstO = 3, lockFirstT = 9, lockSecondO = 9, lockSecondT = 15, lockThirdO = 27, lockThirdT = 33; // so lock 1 would be 3-9 lock second would be 9-15 lock third would be 27-33
        int numb;
        Scanner scan = new Scanner(System.in);

        int attempt = 0;
        boolean open = false;

        while (attempt < 3 && !open) { // until you have completed three tries it allows you to try
            
            boolean correct = true;

            // the first Number
            System.out.println("\nEnter first number: ");
            numb = scan.nextInt();

            if (numb < lockFirstO && numb > lockFirstT)
                correct = false;

            //the second number
            System.out.println("Enter second number: ");
            numb  = scan.nextInt();

            if (numb < lockSecondO && numb > lockSecondT)
                correct = false;

            // the third number
            System.out.println("Enter third number: ");
            numb  = scan.nextInt();

            if (numb < lockThirdO && numb > lockThirdT )
                correct = false;

            // sees if the lock opens or not
            if (correct) {
                System.out.println("Lock opens");
                open = true;
            } else
                System.out.println("Lock does not open");

            attempt = attempt + 1;
        }
    }
}