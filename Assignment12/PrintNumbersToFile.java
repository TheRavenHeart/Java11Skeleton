import java.util.Scanner;
import java.io.*;

class PrintNumbersToFile {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int dataA = 0;
        int Gender, IQ, Height;
        File file = new File("data.txt");
        PrintStream print = new PrintStream(file);

        while (dataA != -1) {
            System.out.print("Age in years(-1 to exit): ");
            dataA = scan.nextInt();
            print.println(dataA);
            if(dataA == -1){
                continue;
            }
            System.out.println("Enter your IQ score");
            IQ = scan.nextInt();
            print.println(IQ);
            System.out.println("Please enter your preferred gender, 1 for male 0 for female.");
            Gender = scan.nextInt();
            print.println(Gender);
            print.println(Gender);
            System.out.println("Please enter your height in inches.");
            Height = scan.nextInt();
            print.println(Height);
        }

        print.close();
    }
}