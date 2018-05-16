import java.io.*;

class ThreeSums {

    public static void main(String[] args) throws IOException {
        int[] data = { 3, 2, 5, 7, 9, 12, 97, 24, 54 };
        
        int evenSum = 0;
        int oddSum = 0;
        int totalSum = 0;

        for (int index = 0; index < data.length; index++) {
            if (data[index] % 2 == 0){ // checks to see if they can be divided by 2
                evenSum = evenSum + data[index]; // adds all the even numbers
            } else{
                oddSum = oddSum + data[index]; // adds all the odd numbers
            }
            
        }
        totalSum = evenSum + oddSum;
        // writes out the three sums
        System.out.println("The even sum is: " + evenSum +"  the odd sum is: " + oddSum + " the total sum is: " + totalSum);

    }
}