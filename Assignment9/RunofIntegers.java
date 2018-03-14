import java.util.Scanner;
class RunofIntegers {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start, end,times, count;
        System.out.println("Enter start:"); // this designates where the number starts
        start = sc.nextInt();
        System.out.println("Enter End:"); // this designates where the number ends
        end = sc.nextInt();
        while (start<=end) { // this adds and prints out what they designate as start until it equals end
            System.out.println(start);
            start = start + 1; 
        }
    }
}