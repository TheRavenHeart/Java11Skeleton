import java.util.Scanner;
class EchoAlt {
    public static void main (String[] args) {
        String inData;
        Scanner dog = new Scanner(System.in);
        System.out.print("Hello, enter your name "); // When you take out the ln it make it so that your name is printed on the same like as Hello, enter your name. so it turns out as Hello, enter your namejaden 
        inData = dog.nextLine();
        System.out.println("Hello, " + inData);
    }
}