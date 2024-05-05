package Labs;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      while (true) {
         String text = scnr.nextLine();
         if (text.equalsIgnoreCase("quit") || text.equalsIgnoreCase("q")) {
            break;
         }
         StringBuilder reversed = new StringBuilder(text).reverse();
         System.out.println(reversed);
      }
      scnr.close();
   }
}
