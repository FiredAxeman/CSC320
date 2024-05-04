package Chapter2;
import java.util.Scanner;
public class SphereRadius {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double sphereVolume;
        double sphereRadius;
  
        sphereRadius = scnr.nextDouble();
  
        /* Your solution goes here  */
        sphereVolume = (4.0/3.0) * 3.14159265 * (sphereRadius * sphereRadius * sphereRadius);
  
        System.out.printf("%.2f\n", sphereVolume);
        scnr.close();
     }
}
