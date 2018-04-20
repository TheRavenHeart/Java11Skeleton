import java.util.Scanner;
import java.io.*;

class GetNumbersFromFile {
    public static void main(String[] args) throws IOException {

        File file = new File("data.txt");
        Scanner scan = new Scanner(file);
        int data = 0;

        while (data != -1) {
            data = scan.nextInt();
            System.out.println(data);
        }
        scan.close();
    }
}