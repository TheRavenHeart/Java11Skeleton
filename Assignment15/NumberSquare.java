import java.util.Scanner;
class NumberSquare{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int Num, Tanswer;
    Num = 1;
    while(Num > 0){
        System.out.println("Enter a number.");
        Num = sc.nextInt();
        if(Num == 0){
            continue;
        }
        Tanswer = Num * Num;
        System.out.println(Num + "^2 =" + Tanswer); 
    }
    System.out.println("Bye");
}
}