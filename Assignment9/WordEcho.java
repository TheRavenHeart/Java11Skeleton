import java.util.Scanner;
class WordEcho {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String word;
            System.out.println("Please enter a word.");
            word = sc.nextLine();
            
            int times, Atimes;
            Atimes = 1;
            times = word.length();
            while(Atimes <= times){
                System.out.println(word);
                Atimes = Atimes + 1;
            }
        }
    }