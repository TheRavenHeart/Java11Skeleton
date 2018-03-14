import java.util.Scanner;
class WordsDots {
        public static void main(String[] args) {
            String word, sWord;
            int times, Stimes, tTimes;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter The first word."); // this takes the first word and second words
            word = sc.nextLine();
            System.out.println("Enter the second word."); 
            sWord = sc.nextLine();
            
            
            times = word.length(); // this counts the first words cahracters as well as the seconed into numbers 
            Stimes = sWord.length(); 
            
            tTimes = Stimes + times; // this adds the number of characters together
            System.out.print(word); // this prints out the first word
            while((tTimes) < 30 ){ // this prints periods until it reachs the the combined character length - 30
                System.out.print("."); // by doing print instead of println it prints on the same line
                tTimes = tTimes + 1;
            }
            System.out.print(sWord); // this prints the second word on the same line as the the periods and the first word
    }
}