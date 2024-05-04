package Chapter3;

import java.util.Scanner;

public class UpdateNumberOfUsers {
    public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int numUsers;
      int updateDirection;

      numUsers = scnr.nextInt();
      updateDirection = scnr.nextInt();

      numUsers = (updateDirection == 1) ? numUsers + 1 : numUsers - 1;
      scnr.close();
      System.out.println("New value is: " + numUsers);
   }
}
