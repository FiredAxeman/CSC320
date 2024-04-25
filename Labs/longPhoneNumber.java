package Labs;

import java.util.Scanner;

public class longPhoneNumber {
     public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      long phoneNumber;
      // Add more variables as needed

      phoneNumber = scnr.nextLong();
      
      /* Type your code here. */
      System.out.print("(" + phoneNumber / 10000000 + ")");
      System.out.print(" ");
      System.out.print(phoneNumber % 10000000 / 10000 );
      System.out.print("-");
      System.out.println(phoneNumber % 10000);
      
   }
}
