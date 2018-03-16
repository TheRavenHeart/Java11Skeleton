import java.util.Scanner;
class InrangeAdder {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in); 
        int rangeOne, rangeTwo, Data, Num, Sum, Sumtwo;
        System.out.println("This is an Inrange Adder");
        System.out.println("Enter the low-end of the range");
        rangeOne = sc.nextInt();
        System.out.println("Enter the high-end of the range");
        rangeTwo = sc.nextInt();
        System.out.println("Enter data.");
        Num = sc.nextInt();
        Sum = 0;
        Sumtwo = 0;
        if(Num < rangeOne || Num > rangeTwo ){ // Sumtwo = the out of range and sum = in range
                Sumtwo = Sumtwo + Num;
            } else{
                Sum = Sum + Num;  
            }
        
        while(!(Num == 0)){ // Takes data and adds it to either out or in range sums until the user enters 0
            System.out.println("Enter data.");
            Num = sc.nextInt();
            if(Num < rangeOne || Num > rangeTwo ){
                Sumtwo = Sumtwo + Num;
            } else{
               Sum = Sum + Num; 
            }
        }
        
        
        System.out.println("Sum of the numbers in range is " + Sum);
        System.out.println("Sum of the numbers out of range is " + Sumtwo);
    }
}