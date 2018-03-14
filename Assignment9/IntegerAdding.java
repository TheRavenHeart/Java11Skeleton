import java.util.Scanner;
class IntegerAdding {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int Times, Ztimes, sum, num;
            System.out.println("How many integers will be entered:");
            Times = sc.nextInt();
            Ztimes = 0;
            sum = 0;
            while(Ztimes < Times){ // this loops until the Ztimes is equal to Times 
                System.out.println("Enter an integer:");
                num = sc.nextInt(); // this sets the num to whatever the user enters
                Ztimes = Ztimes + 1;
                sum = sum + num; // this adds it to the sum
            }
            System.out.println("The sum of the numbers you've entered is " + sum);
        }
    }