import java.util.Scanner;
class How_To_Get_Age {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long age, Days_in_a_year, Age_In_Months, Age_In_Days, Months_in_year;
        
        Days_in_a_year = 365;
        Months_in_year = 12;
        
        System.out.println("Please enter your age:");
        age = scan.nextInt();
        
        Age_In_Days = age * Days_in_a_year;
        Age_In_Months = age * Months_in_year;

        System.out.println("Your age in years is " + age + (" years old."));
        System.out.println("Your age in months is " + Age_In_Months + (" months old."));
        System.out.println("Your age in days is " + Age_In_Days +(" days old"));
    }
}