package CT5;
import java.util.Scanner;

public class CT5 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] temp = {65, 66, 70, 72, 72, 73 , 75};
        int total = 0;
        int average;
        String userInput;
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("Temperature viewer");
        System.out.print("Enter a specific day or enter week for the weekly average: ");
        userInput = scnr.next();
        userInput = userInput.toLowerCase();
        if (userInput.equals("week")) {
            for (int i = 0; i < temp.length; i++) {
                System.out.printf("%s: %d\n", weekdays[i], temp[i]);
                total += temp[i];
            }
            average = total / temp.length;
            System.out.println("Weekly average: " + average);
        }
        else {
            for (int i = 0; i < weekdays.length; i++) {
                if (userInput.equals(weekdays[i].toLowerCase())) {
                    System.out.printf("%s: %d\n", weekdays[i], temp[i]);
                    break;
                }
            }
        }
    }
}
