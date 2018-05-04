import java.util.Scanner;
class TimesTable{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int Num, Times, Answer, Tanswer, Number, Correct;
    System.out.println("Enter the times table: ");
    Num = sc.nextInt();
    Times = 1;
    Correct = 0;
    while(Times <= Num){
        System.out.println(Num +"*" + Times + " = ");
        Answer = sc.nextInt();
        Tanswer = Num * Times;
        if(Answer == Tanswer){ // checks if the answer is correct
            System.out.println("Correct!");
            Correct ++;
            
        } else {
            System.out.println("Incorrect! The Answer is " + Tanswer);
        }
        Times ++;
    }
    System.out.println("You got " + Correct + " out of " + (Times - 1) + " questions right!"); // I had to minus the times by one in order to get the right end number
}
}