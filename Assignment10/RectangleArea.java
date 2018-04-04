import java.util.Scanner;
class RectangleArea  {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int firstX, firstY, secondX, secondY, Width, Height, Area, Loops, Loop;
        String User;
        Loops = 1;
        Loop = 0;
        System.out.println("This is a program designed to aid in the finding of the area of a rectangle");
        System.out.println("Please enter user name");
        User = sc.nextLine();
        if(User .equals ("Master") || User .equals ("master")){    // This makes sure that anyone who Isn't named jaden and is trying to be the master is instanly Penalized
            System.out.println("Your are not Jaden R. Killer. Re-imputting name");
            User = ("Fool");
        }
        if(User .equals ("Jaden") || User .equals ("jaden")){   // As the Creator of this program the program will refer to me with respect
            System.out.println("Welcome back Master Jaden.");
            User = ("Master");
        }
        System.out.println(User + " Please enter first corner X coordinate.");
        firstX = sc.nextInt();
        System.out.println("Please enter first corner Y coordinate.");
        firstY = sc.nextInt();
        System.out.println("Please enter second corner X coordinate.");   // This takes all of the coordinates
        secondX = sc.nextInt();
        System.out.println("Please enter second corner Y coordinate.");
        secondY = sc.nextInt();
        if(firstX > secondX){
            Width = firstX - secondX;
        } else{             // This makes sure the program doesn't use negitive numbers unless both are negitive
            Width = secondX - firstX;
        }
        if(firstY > secondY){
            Height = firstY - secondY;
        }else{      // See above
            Height = secondY - firstY;
        }
                Area = Height * Width; // This calculates the Area of the rectangle
                System.out.println("Width =" + Width +"  Height =" + Height + " Area = " + Area);
                System.out.println("Please enter 0 if you would like to continue or 1 if you would like to stop.");
                Loop = sc.nextInt();
        while(Loop <= 0){ // This loops until other wise numbered
            if(Loops < 5){
                System.out.println(User + " Please enter first corner X coordinate.");
                firstX = sc.nextInt();
                System.out.println("Please enter first corner Y coordinate.");
                firstY = sc.nextInt();
                System.out.println("Please enter second corner X coordinate.");
                secondX = sc.nextInt();
                System.out.println("Please enter second corner Y coordinate.");
                secondY = sc.nextInt();
                if(firstX > secondX){
                    Width = firstX - secondX;
                } else{
                    Width = secondX - firstX;
        }
        if(firstY > secondY){
            Height = firstY - secondY;
        }else{
            Height = secondY - firstY;
        }
                Area = Height * Width;
                System.out.println("Width = " + Width +"  Height = " + Height + " Area = " + Area);
                System.out.println("Please enter 0 if you would like to continue or 1 if you would like to stop.");
                Loop = sc.nextInt();
                Loops = Loops + 1;
                if(User .equals ("Master")){//The creator of the program should never have to take whatever abuse the program shells out to normal people.
                    Loops = 0;
                }
                if(User .equals ("Fool")){      //This is the second penalty
                    Loops = 5;
                }
            } else {
                System.out.println("Really? You're STILL doing this? Well whatever");
                System.out.println(User + " Enter first corner X coordinate.");
                firstX = sc.nextInt();
                System.out.println("Enter first corner Y coordinate.");
                firstY = sc.nextInt();
                System.out.println("Enter second corner X coordinate.");        //After a while the Program will start to question why someone needs to know the height, width and area of rectangles.
                secondX = sc.nextInt();
                System.out.println("Enter second corner Y coordinate.");        //After this change happens the program will start refering to the person less politly as if dropping a charade.
                secondY = sc.nextInt();
                if(firstX > secondX){
                    Width = firstX - secondX;
                } else{
                    Width = secondX - firstX;
        }
        if(firstY > secondY){
            Height = firstY - secondY;
        }else{
            Height = secondY - firstY;
        }
                Area = Height * Width;
                System.out.println("Width = " + Width +"  Height = " + Height + " Area = " + Area);
                System.out.println("Enter 0 if you still wanna continue or 1 if you still wanna stop, I got nothing else to do."); // this Change makes it obvisus that the program really doesntcare about you or your rectangles.
                Loop = sc.nextInt();
                Loops = Loops + 1;
        }
        }
        if(Loops < 5){
            System.out.println("Thank you for using me, next time you have a area problem please consider using my program.");
        } else {
            System.out.println("It's about time that you finished, get on with your life already.");// Life advice
        }
    }
}