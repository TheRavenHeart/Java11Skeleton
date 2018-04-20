import java.util.Scanner;

class GuessingGame {
    public static void main(String[] args) {
        int someValue, guessO, guessT, guessTHR, conT;
        boolean Continue;
        Continue = true;
        Scanner sc = new Scanner(System.in);
        while(Continue = true){
            someValue = (int)(Math.random() * 10) + 1;
            System.out.println("Welcome to the Guessing Game, you have three trys to pick a number between 1 & 3. If you do not get it then you'll have a penetly. Good luck!");
            guessO = sc.nextInt();
            if (guessO == someValue){
                System.out.println("Congratulations, You've guessed it on your first try, would you like to try again? Press 1 if so and 0 if not. ");
                conT = sc.nextInt();
                if(conT == 1){
                    continue;
                } else{
                    Continue = false;
                    continue;
                }
            } else {
                System.out.println("Unfortunately that is not correct, please try again.");
                guessT = sc.nextInt();
            }
            if(guessT == someValue){
                System.out.println("Congratulations, You've guessed it on your second try, would you like to try again? Press 1 if so and 0 if not. ");
                conT = sc.nextInt();
                if(conT == 1){
                    continue;
                } else{
                    Continue = false;
                    continue;
                }
            } else {
                System.out.println("Unfortunately that is not correct, please try again, and remember this is your last chance.");
                guessTHR = sc.nextInt();
            }
            if(guessTHR == someValue){
                System.out.println("Congratulations, You've guessed it on your last try, would you like to try again? Press 1 if so and 0 if not. ");
                conT = sc.nextInt();
                if(conT == 1){
                    continue;
                } else{
                    Continue = false;
                    continue;
                }
            } else {
                System.out.println("Unfortunately that is not correct, PENALTY.");
                System.out.println("You are sentenced to listing to the entirety of The Adventure Zone.");
                System.out.println("http://www.maximumfun.org/shows/adventure-zone");
                break;
            }
            }
        System.out.println("I hope you've enjoyed this game.");    
    }
    }

    
