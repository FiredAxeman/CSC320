package Labs;

import java.util.Scanner;

public class calories {
     public static void main(String[] args) {
      
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      int age;
      int weight;
      int heartRate;
      int time;
      double men;
      double women;
      age = scnr.nextInt();
      weight = scnr.nextInt();
      heartRate = scnr.nextInt();
      time = scnr.nextInt();
      women =  ((age * 0.074) - (weight * 0.05741) + (heartRate * 0.4472) - 20.4022 ) * time / 4.184;
      men = ((age * 0.2017) + (weight * 0.09036) + (heartRate * 0.6309) - 55.0969 ) * time / 4.184;
      
      System.out.printf("Women: %.2f calories\n", women);
      System.out.printf("Men: %.2f calories\n", men);
      scnr.close();
      
   }
}
