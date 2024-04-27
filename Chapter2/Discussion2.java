package Chapter2;

import java.util.Scanner;

public class Discussion2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String firstName;
        String lastName;
        int age;
        int i = 1;
        
        while (i < 1) {
            firstName = scnr.next();
            lastName = scnr.next();
            age = scnr.nextInt();
            System.out.println("Name: " + firstName + " " + lastName);
            System.out.println("Age: " + age);
            i++;
            System.out.println("Run again?");
            System.out.println("1 for yes, 0 for no");
            i = scnr.nextInt();
            if(i == 0) {
                break;
            }
        }
    }
}
