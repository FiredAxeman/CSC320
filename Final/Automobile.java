public class Automobile {

  private String make;
  private String model;
  private String color;
  private int year;
  private int mileage;

  // Default constructor
  public Automobile() {
  }

  // Parameterized constructor
  public Automobile(String make, String model, String color, int year, int mileage) throws Exception {
    if (make.isEmpty() || model.isEmpty() || color.isEmpty() || year < 1900 || mileage < 0) {
      throw new Exception("Invalid vehicle information provided.");
    }
    this.make = make;
    this.model = model;
    this.color = color;
    this.year = year;
    this.mileage = mileage;
  }

  // Add a new vehicle
  public String addNewVehicle(String make, String model, String color, int year, int mileage) throws Exception {
    try {
      new Automobile(make, model, color, year, mileage);
      this.make = make;
      this.model = model;
      this.color = color;
      this.year = year;
      this.mileage = mileage;
      return "Vehicle added successfully.";
    } catch (Exception e) {
      return e.getMessage();
    }
  }

  // List vehicle information
  public String[] listVehicleInformation() {
    String[] info = {make, model, color, String.valueOf(year), String.valueOf(mileage)};
    return info;
  }

  // Remove vehicle (sets all attributes to empty/default values)
  public String removeVehicle() {
    this.make = "";
    this.model = "";
    this.color = "";
    this.year = 0;
    this.mileage = 0;
    return "Vehicle removed.";
  }


  public String updateVehicleAttributes(String make, String model, String color, int year, int mileage) throws Exception {
    try {
      new Automobile(make, model, color, year, mileage);
      this.make = make;
      this.model = model;
      this.color = color;
      this.year = year;
      this.mileage = mileage;
      return "Vehicle updated successfully.";
    } catch (Exception e) {
      return e.getMessage();
    }
  }
}