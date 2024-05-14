package Chapter5;

import java.util.Scanner;

public class CourseGradePrinter {
    public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_VALS = 4;
      int [] courseGrades = new int[NUM_VALS];
      int i;

      for (i = 0; i < courseGrades.length; ++i) {
         courseGrades[i] = scnr.nextInt();
      }

      for (i = 0; i < 4; i++) {
         System.out.print(courseGrades[i] + " ");
      }
      System.out.println();
      for (i = 3; i >= 0; i--) {
         System.out.print(courseGrades[i] + " ");
      }
      System.out.println();

   }
}
