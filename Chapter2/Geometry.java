package Chapter2;
import java.util.Scanner;
public class Geometry {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double x1;
        double y1;
        double x2;
        double y2;
        double pointsDistance;
        
  
        pointsDistance = 0.0;
        
  
        x1 = scnr.nextDouble();
        y1 = scnr.nextDouble();
        x2 = scnr.nextDouble();
        y2 = scnr.nextDouble();
  
        /* Your solution goes here  */
        pointsDistance = Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
  
        System.out.println(pointsDistance);
        scnr.close();
         
    }
    
}
