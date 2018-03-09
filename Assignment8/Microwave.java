import java.util.Scanner;
class Microwave {
    public static void main(String[] args) {
        double SingleItemH,NumberOfItems;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("How many items do you wish to heat?");
        NumberOfItems = sc.nextDouble();
        System.out.println("How long does it take to heat a single item in seconds?");
        SingleItemH = sc.nextDouble();
        if(NumberOfItems == 1){
            System.out.println("to heat one item it would take " + SingleItemH + "Seconds");
        }
        if(NumberOfItems == 2){
            System.out.println("to heat two item it would take " + (SingleItemH * 1.5) + "Seconds");
        }
        if(NumberOfItems == 3){
            System.out.println("to heat three item it would take " + (SingleItemH * 2 ) + "Seconds");
        }
        if(NumberOfItems >= 4){
            System.out.println("Heating more than three items at once is not recommended, please try again.");
        }
    }
}