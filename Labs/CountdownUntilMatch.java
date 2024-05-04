package Labs;

import java.util.Scanner;

public class CountdownUntilMatch {
     public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum;
      userNum = scnr.nextInt();
      if (userNum >= 11 && userNum <= 100) {
         System.out.print(userNum + " ");
         while (userNum / 10 != userNum % 10) {
            userNum--;
            System.out.print(userNum + " ");
         }
         System.out.println("");
      }
      else if(userNum <= 10 || userNum > 100) {
         System.out.println("Input must be 11-100");
      }
      scnr.close();
   }
}
