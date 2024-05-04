package CT2;
import java.util.Scanner;

public class CT2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        // define variables
        double userInput;
        double taxRate;
        double taxAmount;
        double totalPay;
        System.out.println("Please enter the weekly income:");
        userInput = scnr.nextInt();
        // calculate tax rate, tax amount, and total pay with if-else statements
        if (userInput < 500) {
            taxRate = 0.10;
            //assigned variables to taxAmount, tax rate, and total pay rather than calculating inside the print statement
            taxAmount = userInput * taxRate;
            totalPay = userInput - taxAmount;
            //output with .2f to format to 2 decimal places
            System.out.printf("Gross pay: $%.2f Tax rate: %.0f%% Total pay: $%.2f%n", userInput, taxRate * 100, totalPay);
        }
        else if (userInput >= 500 && userInput < 1500) {
            taxRate = 0.15;
            taxAmount = userInput * taxRate;
            totalPay = userInput - taxAmount;
            System.out.printf("Gross pay: $%.2f Tax rate: %.0f%% Total pay: $%.2f%n", userInput, taxRate * 100, totalPay);
        }
        else if (userInput >= 1500 && userInput < 2500) {
            taxRate = 0.20;
            taxAmount = userInput * taxRate;
            totalPay = userInput - taxAmount;
            System.out.printf("Gross pay: $%.2f Tax rate: %.0f%% Total pay: $%.2f%n", userInput, taxRate * 100, totalPay);
        }
        else if (userInput >= 2500) {
            taxRate = 0.30;
            taxAmount = userInput * taxRate;
            totalPay = userInput - taxAmount;
            System.out.printf("Gross pay: $%.2f Tax rate: %.0f%% Total pay: $%.2f%n", userInput, taxRate * 100, totalPay);
        }
        scnr.close();
    }
}
