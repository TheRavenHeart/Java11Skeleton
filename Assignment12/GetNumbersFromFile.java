import java.util.Scanner;
import java.io.*;

class GetNumbersFromFile {
    public static void main(String[] args) throws IOException {
        File file = new File("data.txt"); // takes all the numbers
        Scanner scan = new Scanner(file);
        int age = 0;
        int totalpeople = 0;
        int height, ageO, IQ, Male, Female, AgeY, People, Gender, AIQ, AH;
        Male = 0;
        Female = 0;
        AIQ = 0;
        AH = 0;
        AgeY = Integer.MAX_VALUE; // for the youngest
        ageO = 0; // forthe oldest
        int MSIQO = 0;
        while (scan.hasNextInt()) {
            age = scan.nextInt();
            if(age == -1){
                break;
            }
            IQ = scan.nextInt();
            height = scan.nextInt();
            Gender = scan.nextInt();
            totalpeople ++; // adds to the total people
            AIQ = AIQ + IQ;
            AH = AH + height;
           
            if(age > ageO){ // makes it that the hgihest age is stored
                ageO = age;
            }
            if (age < ageO && AgeY > age){ // mkeas it so that the youngest age is stored
                AgeY = age;
            }
            if(height <= 72 && Gender == 1 && IQ > 140){ // sees whos over 6 feet a male and has an IQ over 140
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
        System.out.println("Average height: " + AH); // prints it all out
        System.out.println("Oldest: " + ageO);
        System.out.println("Youngest: " + AgeY);
        scan.close();       //System.out.println(data);
    }
}