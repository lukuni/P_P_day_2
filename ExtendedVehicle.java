// Define the Vehicle class
public class Vehicle {

    // Attribute for make of the vehicle
    private String make;
    
    // Attribute for model of the vehicle
    private String model;
    
    // Attribute for year of the vehicle
    private int year;

    // New attribute for fuel
    private double fuel;

    // Constructor to initialize Vehicle object
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuel = 0.0; // Default fuel
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Level: " + fuel + " liters");
    }

    // Method to refuel the vehicle
    public void refuel(double amount) {
        if (amount > 0) {
            fuel += amount;
            System.out.println(amount + " liters added. New fuel level: " + fuel + " liters.");
        } else {
            System.out.println("Invalid amount. Cannot refuel.");
        }
    }

    // Getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getFuel() {
        return fuel;
    }
}
