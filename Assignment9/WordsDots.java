import java.util.Scanner;
class WordsDots {
        public static void main(String[] args) {
            String word, sWord;
            int times, Stimes, tTimes;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter The first word.");
            word = sc.nextLine();
            System.out.println("Enter the second word.");
            sWord = sc.nextLine();
            
            
            times = word.length();
            Stimes = sWord.length();
            
            tTimes = Stimes + times;
            System.out.print(word);
            while((tTimes) < 30 ){
                System.out.print(".");
                tTimes = tTimes + 1;
            }
            System.out.print(sWord);
        }
    }