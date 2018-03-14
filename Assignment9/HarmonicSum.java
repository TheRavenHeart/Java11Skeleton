import java.util.Scanner;
class HarmonicSum{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int Times, Ztimes, Div;
            double one, div, num, sum;
            System.out.println("How many integers will be entered:");
            Times = sc.nextInt();
            Ztimes = 0;
            sum = 0;
            one = 1.0;
            Div = 1;
            while(Ztimes < Times){
                Ztimes = Ztimes + 1;
                num = one / Div;
                Div = Div + 1;
                sum = sum + num;
        }
        System.out.println("Sum is: " + sum);
    }
}