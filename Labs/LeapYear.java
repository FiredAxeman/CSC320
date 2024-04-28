package Labs;

import java.util.Scanner;

public class LeapYear {
    public static boolean isLeapYear(int year) {
      if (year % 4 == 0) {
         if (year % 100 == 0) {
            return year % 400 == 0;
         }
         else {
         return true;
         }
      }
      else {
         return false;
      }
   }
      
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int inputYear;
      inputYear = scnr.nextInt();
      if (isLeapYear(inputYear)) {
         System.out.println(inputYear + " is a leap year.");
      }
      else {
         System.out.println(inputYear + " is not a leap year.");
      }
   }
}
