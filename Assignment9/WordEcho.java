import java.util.Scanner;
class WordEcho {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String word;
            System.out.println("Please enter a word.");
            word = sc.nextLine(); // this remembers the word inputed
            
            int times, Atimes;
            Atimes = 1;
            times = word.length(); // this converts the the words characters to numbers and stores it
            
            while(Atimes <= times){ // this prints the word until it equals the number of characters
                System.out.println(word);
                Atimes = Atimes + 1;
            }
        }
    }