import java.util.Scanner;
import java.io.*;

class GetNumbersFromFile {
    public static void main(String[] args) throws IOException {
        File file = new File("data.txt");
        Scanner scan = new Scanner(file);
        int age = 0;
        int totalpeople = 0;
        int height, ageO, IQ, Male, Female, AgeY, People, Gender, AIQ, AH;
        Male = 0;
        Female = 0;
        AIQ = 0;
        AH = 0;
        AgeY = Integer.MAX_VALUE;
        ageO = 0;
        int MSIQO = 0;
        while (scan.hasNextInt()) {
            age = scan.nextInt();
            if(age == -1){
                break;
            }
            IQ = scan.nextInt();
            height = scan.nextInt();
            Gender = scan.nextInt();
            totalpeople ++;
            AIQ = AIQ + IQ;
            AH = AH + height;
           
            if(age > ageO){
                ageO = age;
            }
            if (age < ageO && AgeY > age){
                AgeY = age;
            }
            if(height <= 72 && Gender == 1 && IQ > 140){
                MSIQO ++;
            }
            if(Gender == 1){
                Male ++;
            } else{
                Female ++;
            }
        }
        
        AIQ = AIQ / totalpeople;
        AH = AH / totalpeople;
        System.out.println("Total people: " + totalpeople);
        System.out.println("Males: " + Male);
        System.out.println("Females: " + Female);
        System.out.println("Males over 6 feet and greater than 140 IQ: " + MSIQO);
        System.out.println("Average IQ: " + AIQ);
        System.out.println("Average height: " + AH);
        System.out.println("Oldest: " + ageO);
        System.out.println("Youngest: " + AgeY);
        scan.close();       //System.out.println(data);
    }
}