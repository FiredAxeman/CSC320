package CT6;
import java.util.Scanner;
public class CT6 {
    public static void main(String[] args) {
        // Create a new Automobile object inside private variables make, model, color, and year
        Automobile car = new Automobile("Toyota", "Corolla", "Red", 2015);
        Scanner scanner = new Scanner(System.in);
        // Call the equals method on the car object
        car.equals(scanner); 
    }
}
