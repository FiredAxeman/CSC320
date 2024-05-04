package Labs;

import java.util.Scanner;

public class InterstateHighwayNums {
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int highwayNumber;
      

      highwayNumber = scnr.nextInt();
      scnr.close();
      
      /* Type your code here. */
      if (highwayNumber >= 1 && highwayNumber <= 999) {
      if (highwayNumber <= 99) {
        if (highwayNumber % 2 == 0) {
          System.out.println("I-" + highwayNumber + " is primary, going east/west.");
        } 
        else {
          System.out.println("I-" + highwayNumber + " is primary, going north/south.");
        }
      } 
      else {
         int parentHighwayNum = highwayNumber % 100;
         if (highwayNumber  % 2 == 0) {   
         System.out.println("I-" + highwayNumber + " is auxiliary, serving I-"+ parentHighwayNum + ", going east/west.");
         }
         else {
         System.out.println("I-" + highwayNumber + " is auxiliary, serving I-"+ parentHighwayNum + ", going north/south.");
         }
      }
    } 
    else {
      System.out.println(highwayNumber + " is not a valid interstate highway number.");
    }
   }
}
