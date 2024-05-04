package Labs;

import java.util.Scanner;

public class VariedAmountofInput {
    public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      int sum;
      int count;
      int max;
      sum = 0;
      count = 0;
      max = Integer.MIN_VALUE;
      while (true) {
         int num = scnr.nextInt();
         if (num < 0) {
            break;
         }
         sum += num;
         count++;
         max = Math.max(max, num);
      }
      if (count > 0) {
         int average = (int) sum / count;
         System.out.println("" + average + " " + max);
      } else {
         System.out.println("No valid input provided.");
      }
      scnr.close();
   
      
      
   }
}
