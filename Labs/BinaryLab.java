package Labs;

import java.util.Scanner;

public class BinaryLab {
     public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      int number = scnr.nextInt();
      if (number <= 0) {
      System.out.println("Error: Please enter a positive integer.");
      return;
    }

    StringBuilder binaryString = new StringBuilder();
     while (number > 0) {
      int remainder = number % 2;
      binaryString.append(remainder); 
      number /= 2; 
    }
    
    System.out.println(binaryString);
   }
}
