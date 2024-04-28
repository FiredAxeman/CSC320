package Labs;

import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      String inputMonth;
      String lowerInput;
      int inputDay;
      
      /* Type your code here. */
      inputMonth = scnr.next();
      inputDay = scnr.nextInt();
      
      //spring
      lowerInput = inputMonth.toLowerCase();
      //System.out.println(lowerInput);
      if ((inputDay > 32) || inputDay <= 0) {
         System.out.println("Invalid");
      }
      else if ((lowerInput.equals("march") && inputDay >= 20) || lowerInput.equals("april") || (lowerInput.equals("june") && inputDay <= 20)){
         System.out.println("Spring");
         }
      else if ((lowerInput.equals("june") && inputDay >= 21) || lowerInput.equals("july") || lowerInput.equals("august") || (lowerInput.equals("september") && inputDay <= 21)){
         System.out.println("Summer");  
      }
      else if ((lowerInput.equals("september") && (inputDay >= 22 && inputDay < 31)) || lowerInput.equals("october") || lowerInput.equals("november") || (lowerInput.equals("december") && inputDay <= 20)) {
         System.out.println("Autumn");
      }
      else if ((lowerInput.equals("december") && inputDay >= 21) || lowerInput.equals("january") || lowerInput.equals("february") || (lowerInput.equals("march") && inputDay <= 19)) {
         System.out.println("Winter");  
      }
      
      else {
         System.out.println("Invalid");  
      }
   }
}
