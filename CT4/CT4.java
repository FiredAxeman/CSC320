package CT4;
import java.util.Scanner;

public class CT4 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int i = 0;
        double total = 0;
        double average = 0;
        double max = 0;
        double min = 0;
        double interest = 0;
        double userDouble = 0;
        //double totalWithInterest = 0;
        //initialize variables
        System.out.println("Welcome to the banking system!");
        System.out.println("This system will provide you with:");
        System.out.println("1. Total of the values entered");
        System.out.println("2. Average of the values entered");
        System.out.println("3. Maximum of the values entered");
        System.out.println("4. Minimum of the values entered");
        System.out.println("5. Total interest at our amazing rate of 20%!");
        //option to let i be a user variable
        //System.out.println("How many values would you like to enter?");
        //int i = scnr.nextInt();
        while (i < 5) {
            //input loop for 5 values
            if (i == 0) {
                System.out.println("Enter a value: ");
                userDouble = scnr.nextDouble();
                max = userDouble;
                min = userDouble;
                //initial prompt
            }
            if (i > 0) {
                System.out.println("Enter another value: ");
                userDouble = scnr.nextDouble();
                //repeat prompt
            }
            if (userDouble > max) {
                max = userDouble;
            }
            if (userDouble < min) {
                min = userDouble;
            }
            total += userDouble;
            i++;
        }
        average = total / 5;
        interest = total * 20 / 100;
        //totalWithInterest = total - interest;
        //calculations
        System.out.println("Thank you for using our simple banking system!");
        System.out.printf("Total: $%.2f\n", total);
        System.out.printf("Average: $%.2f\n", average);
        System.out.printf("Maximum: $%.2f\n", max);
        System.out.printf("Minimum: $%.2f\n", min);
        System.out.print("Interest on total at 20%: ");
        System.out.printf( "$%.2f\n", interest);
        //optional output for total - interest.
        //System.out.printf("Total with interest: $%.2f\n", totalWithInterest);
        //output and print formatting to USD / 2 decimal places and including the % sign for interest
        scnr.close();
    }
}
