import java.util.Scanner;
class Echo {
    public static void main (String[] args) {
        String inData;
        Scanner dog = new Scanner(System.in);
        System.out.println("Hello, enter your name ");
        inData = dog.nextLine();
        System.out.println("Hello, " + inData);
    }
}