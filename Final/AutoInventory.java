import java.util.Scanner;

public class AutomobileInventory {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      // Call parameterized constructor
      Automobile car = new Automobile("Honda", "Civic", "Black", 2020, 30000);

      // List vehicle information
      String[] info = car.listVehicleInformation();
      System.out.println("Vehicle Information:");
      for (String s : info) {
        System.out.println(s);
      }

      // Remove vehicle
      System.out.println(car.removeVehicle());

      // Add a new vehicle
      System.out.println(car.addNewVehicle("Toyota", "Camry", "Silver", 2022, 10000));

      // List vehicle information again
      info = car.listVehicleInformation();
      System.out.println("\nNew Vehicle Information:");
      for (String s : info) {
        System.out.println(s);
      }

      // Update vehicle
      System.out.println(car.updateVehicleAttributes("Ford", "Escape", "Blue", 2018, 50000));

      // List vehicle information again
      info = car.listVehicleInformation();
      System.out.println("\nUpdated Vehicle Information:");
      for (String s : info) {
        System.out.println(s);
      }

      // Print to file prompt
      System.out.print("\nDo you want to print the information to a file (Y/N): ");
      String choice = scanner.nextLine().toUpperCase();

      if (choice.equals("Y")) {
        // Implement method to print information to file (e.g., C:\Temp\Autos.txt)
        System.out.println("Information printed to C:\\Desktop\\Autos.txt");
      } else {
        System.out.println("Goodbye!");
      }