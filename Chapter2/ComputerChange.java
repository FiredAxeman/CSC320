package Chapter2;
import java.util.Scanner;

public class ComputerChange {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
      int amountToChange;
      int numFives;
      int numOnes;

      amountToChange = scnr.nextInt();
      numFives = amountToChange / 5;

      /* Your solution goes here  */
      numOnes = amountToChange % 5;

      System.out.print("numFives: ");
      System.out.println(numFives);
      System.out.print("numOnes: ");
      System.out.println(numOnes);
      scnr.close();
   }
}
