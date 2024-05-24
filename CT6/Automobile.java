package CT6;
import java.util.Scanner;
public class Automobile {
    private String make;
    private String model;
    private String color;
    private int year;
    public Automobile(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getYear() {
        return year;
    }
    public boolean equals(Scanner scanner) {
        System.out.println("Enter the make of the car: ");
        String compareMake = scanner.nextLine();
        System.out.println("Enter the model of the car: ");
        String compareModel = scanner.nextLine();
        System.out.println("Enter the color of the car: ");
        String compareColor = scanner.nextLine();
        System.out.println("Enter the year of the car: ");
        int compareYear = scanner.nextInt();
        if (compareMake.equals(make) && compareModel.equals(model) && compareColor.equals(color) && compareYear == year) {
            make = "";
            model = "";
            color = "";
            year = 0;
            System.out.println("Vehicle matches and information removed.");
            return true;
        } else {
            System.out.println("Vehicle does not match.");
            return false;
        }

    }
}
