import java.util.Scanner;
class Paint_Cost {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double area, width, height, paint_cost;

        System.out.println("Please enter the number of meters for the width:");
        width = scan.nextDouble();
        System.out.println("Please enter the number of meters for the length:");
        height = scan.nextDouble();
        area = width * height;
        System.out.println("Please enter the cost of the paint you are buying.");
        paint_cost = scan.nextDouble();
        

        System.out.println("The area of the rectangle with the height and width you entered is " + area +"m");
        System.out.println("The cost of painting this area is a total of $" + area * paint_cost);
    }
}