import java.util.Scanner;
import java.util.Random;

class RandomGuess {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);//hello
            Random generateRandom = new Random();
            int num, guess;
            num = generateRandom.nextInt(100) + 1;
            int GuessHigh = 0;
            int GuessLow = 0;

            System.out.print("Guess the number: ");
            guess = scan.nextInt(); 
            if(guess == num){
                System.out.println("You got it");
            } else{
                if(guess > num){
                GuessHigh = guess - num;
                System.out.println("You were off by: -" + GuessHigh);
            }
            if(guess < num) {
                GuessLow = num - guess;
                System.out.println("You were off by: " + GuessLow);
            }
            }
            
    }
}