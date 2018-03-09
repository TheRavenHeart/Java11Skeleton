import java.util.Scanner;
class RunofIntegers {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start, end,times, count;
        System.out.println("Enter start:");
        start = sc.nextInt();
        System.out.println("Enter End:");
        end = sc.nextInt();
        while (start<=end) {
            System.out.println(start);
            start = start + 1;
        }
    }
}