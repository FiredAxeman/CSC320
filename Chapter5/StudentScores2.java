package Chapter5;

import java.util.Scanner;

public class StudentScores2 {
     public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int SCORES_SIZE = 4;
      int[] oldScores = new int[SCORES_SIZE];
      int[] newScores = new int[SCORES_SIZE];
      int i;

      for (i = 0; i < oldScores.length; ++i) {
         oldScores[i] = scnr.nextInt();
      }

      /* Your solution goes here  */
      for (i = 0; i < newScores.length; i++) {
         if(i == 0) {
            newScores[0] = oldScores[1];
         }
         if(i == 1) {
            newScores[1] = oldScores[2];
         }
         if( i == 2) {
            newScores[2] = oldScores[3];
         }
         if(i == 3) {
            newScores[3] = oldScores[0];
         }
         
         
      }
      

      for (i = 0; i < newScores.length; ++i) {
         System.out.print(newScores[i] + " ");
      }
      System.out.println();
   }
}
