package Chapter2;
import java.util.Random;
import java.util.Scanner;
public class DiceRoll {
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random randGen = new Random();
      int seedVal;

      seedVal = scnr.nextInt();
      randGen.setSeed(seedVal);

      /* Your solution goes here  */
      System.out.println(randGen.nextInt(10));
      System.out.println(randGen.nextInt(10));
      scnr.close();
   }
}
