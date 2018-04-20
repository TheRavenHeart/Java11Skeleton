import java.util.Scanner;
class IncomeCalc {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter how much you get paid per hour.");
    double wage, tax, hours, tax_a;
    wage = sc.nextDouble();
    System.out.println("How many hours have you worked?");
    hours = sc.nextDouble();
    tax = 0.3;
    tax_a = (wage * hours) * tax;
    System.out.println("your net income: " + ((wage * hours) - tax_a));
    }
}