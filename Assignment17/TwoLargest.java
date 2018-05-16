import java.io.*;

class TwoLargest {
  public static void main(String[] args) throws IOException {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};

    int Largest = data[0];
    int SLargest = data[0];
    
    for (int index = 0; index < data.length; index++) {
        if(data[index] > Largest){ // sets it as the largest number if it is higher then the currant highest number
            Largest = data[index];
        }else{ 
            if(data[index] > SLargest && data[index] < Largest){ // because 8 < 12 but it comes after 12 It has to be like this
                SLargest = data[index];
        }
    }
}
    System.out.println("The largest number is: " + Largest + ". the second largest is: " + SLargest+ ".");
}
}