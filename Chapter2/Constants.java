package Chapter2;
import java.util.Scanner;
public class Constants {
    public class ShippingCalculator {
        public static void main(String[] args) {
           Scanner scnr = new Scanner(System.in);
           int shipWeightPounds;
           int shipCostCents = 0;
           final int FLAT_FEE_CENTS = 75;
     
           /* Your solution goes here  */
           final int CENTS_PER_POUND = 25;
           shipWeightPounds = scnr.nextInt();
           shipCostCents = (CENTS_PER_POUND * shipWeightPounds) + FLAT_FEE_CENTS;
     
           System.out.println("Weight(lb): " + shipWeightPounds);
           System.out.println("Flat fee(cents): " + FLAT_FEE_CENTS);
           System.out.println("Cents per pound: " + CENTS_PER_POUND);
           System.out.println("Shipping cost(cents): " + shipCostCents);
           scnr.close();
        }
    }
}
