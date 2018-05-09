Which two terms represent a vector quantity and the scalar quantity of the vector's magnitude, respectively?
import java.util.Scanner;
import java.io.*;

class PrintNumbersToFile {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int dataA = 0;
        int Gender, IQ, Height;
        File file = new File("data.txt");
        PrintStream print = new PrintStream(file); // this prints it to the file

        while (dataA != -1) { // this makes it so that until age = -1 it keeps looping
            System.out.print("Age in years(-1 to exit): ");
            dataA = scan.nextInt();
            print.println(dataA);
            if(dataA == -1){//checks if age = -1
                continue;
            }
            System.out.println("Enter your IQ score");
            IQ = scan.nextInt();
            print.println(IQ);
            System.out.println("Please enter your preferred gender, 1 for male 0 for female.");
            Gender = scan.nextInt();        //takes in all of the data
            print.println(Gender);
            System.out.println("Please enter your height in inches.");
            Height = scan.nextInt();
            print.println(Height);
        }

        print.close();
    }
}