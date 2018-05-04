import java.util.Scanner;
import java.util.Random;

class SumRandom {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random generateRandom = new Random();
        int num, counter,sNum;
        sNum = 0;
        for (counter = 1; counter <= 100; counter++) {
            num = generateRandom.nextInt(25) + 1;
            System.out.println(counter + " " + num);
            sNum = sNum + num;
        }
        System.out.println("The sum of numbers are: " + sNum);
        System.out.print("Let's enter a number just for fun:");
        num = scan.nextInt();
        System.out.println("The number you entered was: " + num);

    }
}