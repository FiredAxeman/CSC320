package Chapter5;
import java.util.Scanner;
public class Discussion51 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String[] names;
        int i;
        System.out.print("Enter number of attendees: ");
        int numAttendees = scnr.nextInt();
        names = new String[(numAttendees * 2)];
        for (i = 0; i < names.length; ++i) {
            if ((i == 0) || (i % 2 == 0)) {
                System.out.print("Enter first name: ");
                names[i] = scnr.next();
            }
            else if ((i ==1) || (i % 2 != 0)) {
                System.out.print("Enter last name: ");
                names[i] = scnr.next();
            }
        }
        System.out.println("Attendees: ");
        for (i = 0; i < names.length; ++i) {
            if ((i == 0) || (i % 2 == 0)) {
                System.out.print(names[i] + ", ");
            }
            else if (i % 2 != 0) {
                System.out.println(names[i] + " ");
            }
        }
    }
}
