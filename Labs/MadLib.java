package Labs;

import java.util.Scanner;

public class MadLib {
public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String firstName;
      String genericLocation;
      int wholeNumber;
      String pluralNoun;
      firstName = scnr.next();
      genericLocation = scnr.next();
      wholeNumber = scnr.nextInt();
      pluralNoun = scnr.next();
      scnr.close();
   
      /* Type your code here. */
   
      System.out.println(firstName + " went to " + genericLocation + " to buy " + wholeNumber + " different types of " + pluralNoun + ".");
   }
}
