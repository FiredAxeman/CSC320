package Labs;

import java.util.Scanner;

public class ExactChange {
    public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      int cents = scnr.nextInt();
      int numDollars = (cents / 100) % 100;
      int numQuarters = (cents % 100) / 25;
      int numDimes    = (cents % 25) / 10;
      int numNickels  = (((cents % 25) % 10) / 5);
      int numPennies  = (((cents % 25) % 10) % 5);

      // no change
      if (cents == 0) {
         System.out.println("No change");
      }
      
      // dollars
      if (numDollars < 2 && numDollars == 1) {
         System.out.println(numDollars + " Dollar");
      }
      
      else if (numDollars >= 2) {
          System.out.println(numDollars + " Dollars");
      }
      
      // quarters
      if (numQuarters < 2 && numQuarters == 1) {
          System.out.println(numQuarters + " Quarter");
      }
      
      else if (numQuarters >= 2) {
          System.out.println(numQuarters + " Quarters");
      }
      
      // dimes      
      if (numDimes < 2 && numDimes == 1) {
          System.out.println(numDimes + " Dime");
      }
      
      else if (numDimes >= 2) {
          System.out.println(numDimes + " Dimes");
      }
      
      // nickels      
      if (numNickels < 2 && numNickels == 1) {
          System.out.println(numNickels + " Nickel");
      }
      
      else if (numNickels >= 2) {
          System.out.println(numNickels + " Nickels");
      }
      
      // pennies      
      if (numPennies < 2 && numPennies == 1) {
          System.out.println(numPennies + " Penny");
      }
      
      else if (numPennies >= 2) {
          System.out.println(numPennies + " Pennies");
      }
   }
}
