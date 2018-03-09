import java.util.Scanner;
class CheckChecker {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double CheckingA, SavingA, Charge;
    Charge = 0.15;
    System.out.println("How much money in dollars do you have in your checking account?");
    CheckingA = sc.nextDouble();
    System.out.println("How much money in dollars do you have in your savings account?");
    SavingA = sc.nextDouble();
    if(CheckingA > 1000 || SavingA > 1500){
        System.out.println("You are not charged.");
    }else{
        System.out.println("Your fees per check = " + Charge);
        }
    } 
}
