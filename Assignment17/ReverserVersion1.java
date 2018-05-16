import java.io.*;

class ReverserVersion1 {

    public static void main(String[] args) throws IOException {
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        
        int temp;
        
        // reverses the data
        for (int j = 0; j < data.length / 2; j++) {
            temp = data[data.length - j - 1] ;
            data[data.length - j - 1] = data[j];
            data[j] = temp;
        }
        
        // write out the new data
        for (int j = 0; j < data.length; j++) { // writes out the new data
            System.out.println(data[j]);
        }

    }
}