package Chapter5;
import java.util.Scanner;
public class Discussion5 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numItems;
        int[] items;
        int i;
        int total = 0;
        System.out.print("Enter number of items: ");
        numItems = scnr.nextInt();
        items = new int[numItems];
        for (i = 0; i < items.length; ++i) {
            System.out.print("Enter number " + (i + 1) + ": ");
            items[i] = scnr.nextInt();
            total += items[i];
        }
        System.out.println("Total: " + total);
    }

}
