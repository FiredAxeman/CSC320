package Chapter6;
import java.util.Scanner;

public class CT6Expanded {
    public static final int MAX_VEHICLES = 100; // maximum number of vehicles 100 seems logical
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String[] autoMake = new String[MAX_VEHICLES];
        String[] autoModel = new String[MAX_VEHICLES];
        String[] autoColor = new String[MAX_VEHICLES];
        int[] autoYear = new int[MAX_VEHICLES];
        int numVehicles = 0; 
        int choice;

        do {
            if (numVehicles == 0) {
                System.out.println("No vehicles in inventory");
                System.out.println("adding a sample vehicle to inventory \n");
                autoMake[numVehicles] = "Toyota";
                autoModel[numVehicles] = "Corolla";
                autoColor[numVehicles] = "Red";
                autoYear[numVehicles] = 2020;
                System.out.println(autoColor[numVehicles] + " " + autoYear[numVehicles] + " " + autoMake[numVehicles] + " " + autoModel[numVehicles] + " added to inventory\n");
                numVehicles++;
            }
            System.out.println("Module 6: Portfolio Milestone");
            System.out.println("Vehicle Inventory Class");
            System.out.println("Menu List");
            System.out.println("1. Check Vehicle");
            System.out.println("2. Add Vehicle");
            System.out.println("3. Sell Vehicle");
            System.out.println("4. Display Vehicles");
            System.out.println("5. Exit");
            choice = scnr.nextInt();
            switch (choice) {
                case 1:
                    checkVehicle(autoMake, autoModel, autoColor, autoYear, numVehicles);
                    break;
                case 2:
                    numVehicles = addVehicle(autoMake, autoModel, autoColor, autoYear, numVehicles);
                    break;
                case 3:
                    numVehicles = sellVehicle(autoMake, autoModel, autoColor, autoYear, numVehicles);
                    break;
                case 4:
                    displayVehicles(autoMake, autoModel, autoColor, autoYear, numVehicles);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        while (choice != 5);

        scnr.close();
    }
    public static void checkVehicle(String[] autoMake, String[] autoModel, String[] autoColor, int[] autoYear, int numVehicles) {
        Scanner scnr = new Scanner(System.in);
        int i;
        String make;
        String model;
        

        System.out.println("Enter make of vehicle: ");
        make = scnr.nextLine();
        make = make.toLowerCase();
        System.out.println("Enter model of vehicle: ");
        model = scnr.nextLine();
        model = model.toLowerCase();
        for (i = 0; i < numVehicles; ++i) {
            if (autoMake[i].equals(make) && autoModel[i].equals(model)) {
                System.out.println("Vehicle found in inventory \n");
                System.out.println("Make: " + autoMake[i]);
                System.out.println("Model: " + autoModel[i]);
                System.out.println("Color: " + autoColor[i]);
                System.out.println("Year: " + autoYear[i]);
                System.out.println("Would you like to remove this vehicle? (y/n)");
                String remove = scnr.nextLine();
                if (remove.equals("y")) {
                    autoMake[i] = autoMake[numVehicles - 1];
                    autoModel[i] = autoModel[numVehicles - 1];
                    autoColor[i] = autoColor[numVehicles - 1];
                    autoYear[i] = autoYear[numVehicles - 1];
                    numVehicles--;
                    System.out.println("Vehicle removed from inventory");
                }
                return;
            }
        }
        System.out.println("Vehicle not found in inventory \n");
    }
    public static int addVehicle(String[] autoMake, String[] autoModel, String[] autoColor, int[] autoYear, int numVehicles) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter make of vehicle: ");
        autoMake[numVehicles] = scnr.nextLine();
        System.out.println("Enter model of vehicle: ");
        autoModel[numVehicles] = scnr.nextLine();
        System.out.println("Enter color of vehicle: ");
        autoColor[numVehicles] = scnr.nextLine();
        System.out.println("Enter year of vehicle: ");
        autoYear[numVehicles] = scnr.nextInt();
        numVehicles++;
        return numVehicles;
    }
    public static int sellVehicle(String[] autoMake, String[] autoModel, String[] autoColor, int[] autoYear, int numVehicles) {
        Scanner scnr = new Scanner(System.in);
        int i;
        String make;
        String model;
        System.out.println("Enter make of vehicle: ");
        make = scnr.nextLine();
        System.out.println("Enter model of vehicle: ");
        model = scnr.nextLine();
        for (i = 0; i < numVehicles; ++i) {
            if (autoMake[i].equals(make) && autoModel[i].equals(model)) {
                autoMake[i] = autoMake[numVehicles - 1];
                autoModel[i] = autoModel[numVehicles - 1];
                autoColor[i] = autoColor[numVehicles - 1];
                autoYear[i] = autoYear[numVehicles - 1];
                numVehicles--;
                System.out.println("Vehicle removed from inventory");
                return numVehicles;
            }
        }
        System.out.println("Vehicle not found in inventory");
        return numVehicles;
    }
    public static void displayVehicles(String[] autoMake, String[] autoModel, String[] autoColor, int[] autoYear, int numVehicles) {
        int i;
        if (numVehicles == 0) {
            System.out.println("No vehicles in inventory");
            return;
        }
        for (i = 0; i < numVehicles; ++i) {
            System.out.println("Vehicle " + (i + 1));
            System.out.println("Make: " + autoMake[i]);
            System.out.println("Model: " + autoModel[i]);
            System.out.println("Color: " + autoColor[i]);
            System.out.println("Year: " + autoYear[i] + "\n");
        }
    }

       


}
   

