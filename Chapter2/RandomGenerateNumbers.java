package Chapter2;
import java.util.Scanner;
import java.util.Random;
public class RandomGenerateNumbers {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random randGen = new Random();
        int seedVal;
  
        seedVal = scnr.nextInt();
        randGen.setSeed(seedVal);
  
        /* Your solution goes here  */
        System.out.println(randGen.nextInt(150 - 100) + 100);
        System.out.println(randGen.nextInt(150 - 100) + 100);
        
  
     }
}
