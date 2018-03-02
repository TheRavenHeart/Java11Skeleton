import java.util.Scanner;
class PieEatingContest {
    public static void main(String[] args) {
        double weight; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a your weight:");
        weight = sc.nextDouble();
        if(weight > 220 && weight < 280 ){
        System.out.println("You may EAT!");
    }else { 
        System.out.println("You must DIE! You are also not allowed to participate");
    }
        
      
}
    }


   