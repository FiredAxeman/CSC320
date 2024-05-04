package Chapter4;

import java.util.Scanner;

public class NestedLoops2 {
     public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int numRows;
      int numColumns;
      int currentRow;
      int currentColumn;

      numRows = scnr.nextInt();
      numColumns = scnr.nextInt();

      /* Your solution goes here  */
      for (currentRow = 1; currentRow <= numRows; currentRow++) {
         for (currentColumn = 65; currentColumn < 65 + numColumns; currentColumn++) {
            System.out.print(currentRow + "" + (char) currentColumn + " ");
         }
      }

      System.out.println("");
      scnr.close();
   }
}
