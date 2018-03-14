import java.util.Scanner;
class HarmonicSum{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int Times, Ztimes, Div;
            double one, div, num, sum;
            System.out.println("How many integers will be entered:");
            Times = sc.nextInt();
            
            Ztimes = 0; // so they all equal what they need to at first
            sum = 0;
            one = 1.0;
            Div = 1;
            while(Ztimes < Times){ // this divides 1 by (1 + Div) each time until it reaches the integer made by the user
                Ztimes = Ztimes + 1;
                num = one / Div;
                Div = Div + 1;
                sum = sum + num;
        }
        System.out.println("Sum is: " + sum);
    }
}