import java.util.Scanner;
import java.util.Random;

class GuessGame {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random generateRandom = new Random();
        int num, guess, guesses, Choice;
        guesses = 0;
        Choice = 1;
        while(Choice == 1){
        num = generateRandom.nextInt(100) + 1; //generates a diffrent number each time
        do { // makes sure it loops at least once and its in its own loop
            System.out.print("Guess the number: ");
            guess = scan.nextInt();

            if (guess > num) // if the number to high it prints to high
                System.out.println("Too High");

            if (guess < num)// does the same as above but if its to low
                System.out.println("Too Low");
            guesses ++;// counts the amount guesses
        }
        while (num != guess);
        System.out.println("You got it");
        System.out.println("your total number of guesses was: " + guesses);
        System.out.println("Would you like to restart? Please press 1 for yes and 0 if not.");
        Choice = scan.nextInt();
        if(Choice == 0){ // this breaks the loop if they press 0 if not it restarts
            break;
        }
    }
    System.out.println("Come back again!");
   
}
}