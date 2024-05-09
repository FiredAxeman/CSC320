package Chapter4;
import java.util.Scanner;
public class Discussion4 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userChoice;
        int i;
        int userNumber;
        int total;
        total = 0;
        System.out.println("Please enter the amount of numbers you wish to add: ");
        userChoice = scnr.nextInt();
        for (i = 0; i < userChoice; i++) {
        System.out.println("Please enter a number: ");
        userNumber = scnr.nextInt();
        total = total + userNumber;
       }
         System.out.println("The total of the numbers entered is: " + total);
         scnr.close();
    }
}
