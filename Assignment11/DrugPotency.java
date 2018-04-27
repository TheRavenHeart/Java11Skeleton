import java.util.Scanner;
class DrugPotency  {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double Mloss, Start, Crit;
        int month;
        Crit = 50.0;
        Mloss = 1.0416666666666667; // forsome reason divided by 4% is really dumb so I had to get this number 
        month = 0;
        System.out.println("Please enter the current effectiveness percentage of the drug. Please keep in mind that there is a 4% loss of percentage every month and at 50% it will be terminated.");
        Start = sc.nextDouble();
        while(Start >= 50.0){ // until it goes benetgh 50% effectiveness it will check each month
            if(month >= 10){
                System.out.println("Month: " + month + "       Effectiveness: "+ Start);
                Start = Start / Mloss;
            }else{
                System.out.println("Month: " + month + "        Effectiveness: "+ Start);
                Start = Start / Mloss;
            }
            month = month + 1;
        }
        System.out.println("Month: " + month + "       Effectiveness: "+ Start);
        Start = Start / Mloss;
        System.out.println("DISCARDED");
    }
}
