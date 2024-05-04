package Chapter2;
import java.util.Scanner;
public class Gravity {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double G = 6.673e-11;
        double M = 5.98e24;
        double accelGravity;
        double distCenter;
  
        distCenter = scnr.nextDouble();
  
        /* Your solution goes here  */
        accelGravity = (G * M) / (distCenter * distCenter);
  
        System.out.println(accelGravity);
        scnr.close();
     }
}
