
import java.util.Scanner;
class How_To_Get_Area {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long area, width, height;

        System.out.println("Please enter the number of centimeters for the width:");
        width = scan.nextInt();
        System.out.println("Please enter the number of centimeters for the length:");
        height = scan.nextInt();
        area = width * height;

        System.out.println ( "The area of the rectangle with the height and width you entered is " + area +"cm");
    }
}