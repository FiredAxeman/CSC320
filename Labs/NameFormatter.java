package Labs;

import java.util.Scanner;

public class NameFormatter {
    public static String formatName(String fullName) {
      String[] nameParts = fullName.split(" ");
   if (nameParts.length < 2) {
      return "Invalid name format";
   }
   String lastName = nameParts[nameParts.length - 1];
   String firstName = nameParts[0];
   String middleName = "";
   if (nameParts.length > 2) {
      middleName = nameParts[1];
   }
   String middleInitial = middleName.isEmpty() ? "": middleName.charAt(0) + ".";
   return lastName + ", " + firstName + " " + middleInitial;
   }
   
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      String fullName = scnr.nextLine();
      String formattedName = formatName(fullName);
      formattedName = formattedName.trim();
      System.out.println(formattedName);
      scnr.close();
   }
}
