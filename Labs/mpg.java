package Labs;

import java.util.Scanner;

public class mpg {
    public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      double input1;
      double input2;
      double costMpg;
      input1 = scnr.nextDouble();
      input2 = scnr.nextDouble();
      costMpg = input2 / input1;
      System.out.printf("%.2f", (costMpg * 20));
      System.out.print(" ");
      System.out.printf("%.2f", (costMpg * 75));
      System.out.print(" ");
      System.out.printf("%.2f", costMpg * 500);
      System.out.println();
      
   }
}
