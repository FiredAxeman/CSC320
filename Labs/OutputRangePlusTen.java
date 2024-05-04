package Labs;

import java.util.Scanner;

public class OutputRangePlusTen {
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userStart;
      int userEnd;
      int i;
      userStart = scnr.nextInt();
      userEnd = scnr.nextInt();
      scnr.close(); 
      if(userEnd < userStart) {
         System.out.println("Second integer can't be less than the first.");
      }
      else {
         for(i = userStart; i <= userEnd; i += 10) {
            System.out.print(i + " ");
         }
         System.out.println();
      }
   }
}
