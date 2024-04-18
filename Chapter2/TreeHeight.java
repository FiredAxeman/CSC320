package Chapter2;
import java.util.Scanner;
public class TreeHeight {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double treeHeight;
        double shadowLength;
        double angleElevation;
  
        angleElevation = scnr.nextDouble();
        shadowLength   = scnr.nextDouble();
  
        /* Your solution goes here  */
        treeHeight = Math.tan(angleElevation) * shadowLength;
  
        System.out.println(treeHeight);
     }
}
