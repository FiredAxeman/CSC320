import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AutomobileInventory {
    public static void main(String[] args) {
        try {
            Automobile car = new Automobile("Toyota", "Camry", "Red", 2018, 25000);

            String[] carInfo = car.listVehicle();
            for (String info : carInfo) {
                System.out.println(info);
            }

            System.out.println(car.removeVehicle());

            System.out.println(car.addVehicle("Ford", "Mustang", "Blue", 2020, 1000));

            carInfo = car.listVehicle();
            for (String info : carInfo) {
                System.out.println(info);
            }
            System.out.println(car.updateVehicle("Honda", "Civic", "Black", 2012, 500000));

            carInfo = car.listVehicle();
            for (String info : carInfo) {
                System.out.println(info);
            }

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