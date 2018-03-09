import java.util.Scanner;
class FantasyGame {
    public static void main(String[] args) {
        int luck, Str, health, MaxPoints;
        String Name;
        MaxPoints = 15;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to DEFINITELY not hell.");
        System.out.println("Please enter your name");
        Name = sc.nextLine();
        System.out.println("Please asign points to yourself keeping in mind you must use less then 15 total points");
        System.out.println("Please enter your strength score (1-10)");
        Str = sc.nextInt();
        System.out.println("Please enter your health score (1-10)");
        health = sc.nextInt();
        System.out.println("Please enter your luck score (1-10)");
        luck = sc.nextInt();
        if((Str+luck+health) > MaxPoints){
            System.out.println("You have give your character too many points!  Default values have been assigned: " + Name +", strength: 5, health: 5, luck: 5");
        } else {
            System.out.println(Name + ", strength: " + Str + ", health: " + health + ", luck: " + luck );
        }
        System.out.println("Good luck!");
    }
}