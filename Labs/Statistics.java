package Labs;

import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int num1;
      int num2;
      int num3;
      int num4;
      double product;
      double avg;
      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      num3 = scnr.nextInt();
      num4 = scnr.nextInt();
      product = num1 * num2 * num3 * num4;
      avg = ((double)num1 + num2 + num3 + num4) / 4;
      System.out.print((int)product);
      System.out.print(" ");
      System.out.println((int)avg);
      System.out.printf("%.3f", product);
      System.out.print(" ");
      System.out.printf("%.3f", avg);
      System.out.println();
      scnr.close();
      /* Type your code here. */
   }
}
