package Labs;

import java.util.Scanner;

public class MusicalNote {
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      double key;
      key = scnr.nextDouble();
      double r;
      r = Math.pow(2, 1.0 / 12.0);
      System.out.printf("%.2f", key );
      System.out.print(" ");
      System.out.printf("%.2f", key * r);
      System.out.print(" ");
      System.out.printf("%.2f", key * Math.pow(r,2));
      System.out.print(" ");
      System.out.printf("%.2f", key * Math.pow(r,3));
      System.out.print(" ");
      System.out.printf("%.2f", key * Math.pow(r,4));
      System.out.println();
   }
}
