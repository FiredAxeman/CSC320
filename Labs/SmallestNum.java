package Labs;

import java.util.Scanner;

public class SmallestNum {
    public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      int userNum;
      int i;
      int lowest;
      userNum = lowest = scnr.nextInt();
      scnr.close();
      for (i =0; i < 2; i++) {
         userNum = scnr.nextInt();
         if (userNum < lowest){
         lowest = userNum;
         }
      }
      
      System.out.println(lowest);
      
   }
}
