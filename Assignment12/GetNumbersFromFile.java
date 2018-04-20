import java.util.Scanner;
import java.io.*;

class GetNumbersFromFile {
    public static void main(String[] args) throws IOException {
        File file = new File("data.txt");
        Scanner scan = new Scanner(file);
        int age = 0;
        int totalpeople = 0;
        int height, ageO, IQ, Male, Female, AgeY, People, Gender;
        while (age != -1) {
            age = scan.nextInt();
            IQ = scan.nextInt();
            height = scan.nextInt();
            Gender = scan.nextInt();
            totalpeople ++;
            if(Gender == 1){
                Male ++;
            } else{
                Female ++;
            }
        }
        scan.close();       //System.out.println(data);
    }
}