package Chapter5;
import java.util.Scanner;
public class Discussion52 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double[] prices = {10.00, 20.00, 30.00, 40.00};
        String[] items = {"Shirt", "Pants", "Shoes", "Hat"};
        int i; 
        for (i = 0; i < prices.length; i++) {
            System.out.printf("Item %d %s: $%.2f\n", (i + 1), items[i], prices[i]);
        }
        System.out.print("Please enter an item # to edit: ");
        int itemNum = scnr.nextInt();
        System.out.print("Please enter the new price: ");
        double newPrice = scnr.nextDouble();
        prices[itemNum - 1] = newPrice;
        System.out.println("Updated prices: ");
        for (i = 0; i < prices.length; i++) {
            System.out.printf("Item %d %s: $%.2f\n", (i + 1), items[i], prices[i]);
        }
        scnr.close();

    }
}
