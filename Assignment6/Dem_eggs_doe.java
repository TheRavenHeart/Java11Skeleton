import java.util.Scanner;
class Dem_eggs_doe {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long eggs, dozen, Dozen_eggs, Left_Over_Eggs;
        dozen = 12;
        System.out.println("Enter how many eggs you have.");
        eggs = scan.nextInt();
        Dozen_eggs = eggs / 12;
        Left_Over_Eggs = eggs % 12;
        
        System.out.println("From what you've entered you have " + Dozen_eggs + " dozen eggs and have " + Left_Over_Eggs + " eggs lef t over");
        
    }
}