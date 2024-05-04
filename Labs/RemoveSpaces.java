package Labs;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      String userString;
      userString = scnr.nextLine();
      userString = userString.replaceAll("\\s", "");
      System.out.println(userString);
      scnr.close();
   }
}
