package Chapter6;
import java.util.Scanner;

public class Discussion6 {
    public static void main(String[] args) {
        int userChoice;
        do {
            menu(args);
            userChoice = input(args);
            selector(userChoice);
            if (userChoice == 1) {
                add(args);
            }
            if (userChoice == 2) {
                subtract(args);
            }
            if (userChoice == 3) {
                multiply(args);
            }
            if (userChoice == 4) {
                divide(args);
            }
        } while (userChoice != 5);
        
    }
    public static void menu(String[] args) {
        System.out.println("Menu:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");

    }
    public static int input (String[] args) {
        int userChoice;
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        userChoice = scnr.nextInt();
        return userChoice;
    }
    public static void selector (int userChoice) {
        switch (userChoice) {
            case 1:
                System.out.println("Addition");
                break;
            case 2:
                System.out.println("Subtraction");
                break;
            case 3:
                System.out.println("Multiplication");
                break;
            case 4:
                System.out.println("Division");
                break;
            case 5:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    public static void add (String[] args) {
        int num1, num2;
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = scnr.nextInt();
        System.out.print("Enter second number: ");
        num2 = scnr.nextInt();
        System.out.println("Sum: " + (num1 + num2));
    }
    public static void subtract (String[] args) {
        int num1, num2;
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = scnr.nextInt();
        System.out.print("Enter second number: ");
        num2 = scnr.nextInt();
        System.out.println("Difference: " + (num1 - num2));
    }
    public static void multiply (String[] args) {
        int num1, num2;
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = scnr.nextInt();
        System.out.print("Enter second number: ");
        num2 = scnr.nextInt();
        System.out.println("Product: " + (num1 * num2));
    }
    public static void divide (String[] args) {
        int num1, num2;
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = scnr.nextInt();
        System.out.print("Enter second number: ");
        num2 = scnr.nextInt();
        System.out.println("Quotient: " + (num1 / num2));
    }
}
