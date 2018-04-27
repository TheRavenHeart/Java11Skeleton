import java.util.Scanner;
class IncomeCalc {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter how much you get paid per hour.");
    double wage, tax, hours, tax_a;
    wage = sc.nextDouble(); // collect your wage
    System.out.println("How many hours have you worked?");
    hours = sc.nextDouble(); // collects how many hours you've worked
    tax = 0.3; // tax
    tax_a = (wage * hours) * tax; // calcualte the tax amount
    System.out.println("your net income: " + ((wage * hours) - tax_a)); // prints out how much much you've made - the tax
    }
}