package Labs;

import java.util.Scanner;

public class PasswordModifier {
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String password = scnr.nextLine();
      StringBuilder newPassword = new StringBuilder();
      for (char c : password.toCharArray()) {
         switch (c) {
            case 'i':
               newPassword.append('!');
               break;
            case 'a':
               newPassword.append('@');
               break;
            case 'm':
               newPassword.append('M');
               break;
            case 'B':
               newPassword.append('8');
               break;
            case 'o':
               newPassword.append('.');
               break;
            default:
               newPassword.append(c);
         }
      }
      newPassword.append("q*s");
      System.out.println(newPassword.toString());
      scnr.close();
   }
}
