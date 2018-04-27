import java.util.Scanner;
class MathOperations {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double NumO, NumT;
        System.out.println("Please enter a number");
        NumO = sc.nextDouble(); // this takes the first number
        System.out.println("Please enter a second number");
        NumT = sc.nextDouble(); // This one takes the second
        System.out.println((NumO + NumT) + "    " + (NumO - NumT) + "   " + (NumO * NumT) +"    " + (NumO / NumT)); // this one prints out what they are added, minused, timesed and divided
    }
}