import java.util.Scanner;
class MathOperations {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double NumO, NumT;
        System.out.println("Please enter a number");
        NumO = sc.nextDouble();
        System.out.println("Please enter a second number");
        NumT = sc.nextDouble();
        System.out.println((NumO + NumT) + "    " + (NumO - NumT) + "   " + (NumO * NumT) +"    " + (NumO / NumT));
    }
}