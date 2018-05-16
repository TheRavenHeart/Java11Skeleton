import java.util.Scanner;
import java.util.Random;

class TestYourLuck {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);//hello
            Random generateRandom = new Random();
            int num, guess, i,Tguess, Correct;
            int GuessHigh = 2;
            int GuessLow = 1;
            Correct = 0;
            for (i = 0; i < 10; i ++){ // loops 10 times
            num = generateRandom.nextInt(100) + 1; // generates a random number
            if(num > 51){// decidedes wether or not it counts as a high number
                num = GuessHigh;
            }
            if(num < 51){// or a low one
                num = GuessLow;
            }
            System.out.println("Please enter 1 if you think the random number is equal to 1-50 and 2 if you think its 51-100");
            Tguess = sc.nextInt();
            if(num == Tguess){ // counts the number of correct guesses
                System.out.println("Correct!");
                Correct ++;
            }else {
                System.out.println("Incorrect");
                }
            }
            if(Correct < 6){
            System.out.println("Lucky!");
            } else{
                System.out.print("Try again next time!");
            }
    }
}