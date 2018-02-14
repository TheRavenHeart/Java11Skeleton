public class Question_6 {
    public static void main(String[] args) {
        double gravity = 9.81;
        double time = 10;
        double velocity = 0;
       
        
        for (int i = 0; i < 10; i++) {
      velocity = velocity + gravity;
      
      
      System.out.println ("the current velocity is " + velocity + "m/s");


    }
}
}