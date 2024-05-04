package Labs;

import java.util.Scanner;

public class MathMethods {
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double x;
      double y;
      double z;
      /* Type your code here. */
      x = scnr.nextDouble();
      y = scnr.nextDouble();
      z = scnr.nextDouble();
      double powxz;
      double powyz;
      double powxyz;
      double abvaly;
      double xypowz;
      double xypowzsr;
      powxz = Math.pow(x,z);
      powyz = Math.pow(y,z);
      powxyz = Math.pow(x, powyz);
      abvaly = Math.abs(y);
      xypowz = Math.pow( x * y, z);
      xypowzsr = Math.sqrt(xypowz);
      scnr.close();
      
   
      
      
      System.out.print(powxz + " " + powxyz + " " + abvaly + " " + xypowzsr + "\n");

      
   }
}
