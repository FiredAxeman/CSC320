import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AutomobileInventory {
    public static void main(String[] args) {
        try {
            // Creating an automobile with parameterized constructor
            Automobile car = new Automobile("Toyota", "Camry", "Red", 2018, 25000);

            // Listing the vehicle information
            String[] carInfo = car.listVehicle();
            for (String info : carInfo) {
                System.out.println(info);
            }

            // Removing the vehicle
            System.out.println(car.removeVehicle());

            // Adding a new vehicle
            System.out.println(car.addVehicle("Honda", "Civic", "Blue", 2020, 10000));

            // Listing the new vehicle information
            carInfo = car.listVehicle();
            for (String info : carInfo) {
                System.out.println(info);
            }

            // Updating the vehicle
            System.out.println(car.updateVehicle("Honda", "Accord", "Black", 2022, 5000));

            // Listing the updated vehicle information
            carInfo = car.listVehicle();
            for (String info : carInfo) {
                System.out.println(info);
            }

            // Asking user if they want to print information to a file
            Scanner scanner = new Scanner(System.in);
            System.out.print("Do you want to print the information to a file (Y or N)? ");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("Y")) {
                try (FileWriter writer = new FileWriter("C:\\Desktop\\Autos.txt")) {
                    for (String info : carInfo) {
                        writer.write(info + "\n");
                    }
                    System.out.println("Information printed to C:\\Desktop\\Autos.txt");
                } catch (IOException e) {
                    System.out.println("Failed to print to file: " + e.getMessage());
                }
            } else {
                System.out.println("A file will not be printed.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}