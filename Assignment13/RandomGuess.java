import java.util.Scanner;
import java.util.Random;

class RandomGuess {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Random generateRandom = new Random();
            int num, guess;
            num = generateRandom.nextInt(100) + 1; // selects a random number between 1-100
            int GuessHigh = 0;
            int GuessLow = 0;

            System.out.print("Guess the number: ");
            guess = scan.nextInt(); // user inputs the number
            if(guess == num){
                System.out.println("You got it");
            } else{
                if(guess > num){ // if it is above the num it prints out -5 if I guessed 50 and it was 45
                GuessHigh = guess - num;
                System.out.println("You were off by: -" + GuessHigh);
            }
            if(guess < num) { // if it is below the num it prints out 5 if I guessed 45 and it was 50
                GuessLow = num - guess;
                System.out.println("You were off by: " + GuessLow);
            }
            }
            
    }
}