package JavaConstructor;

public class Vehicle {
    // Instance Variables
    String ownerName;
    String vehicleType;

    // Class Variable
    static double registrationFee = 100.00; // Default fee

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Class method
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: $" + registrationFee);
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Alice Smith", "Car");
        vehicle1.displayVehicleDetails();

        System.out.println();

        Vehicle vehicle2 = new Vehicle("Bob Johnson", "Motorcycle");
        vehicle2.displayVehicleDetails();

        System.out.println();

        // Update registration fee for all vehicles
        Vehicle.updateRegistrationFee(150.00);

        System.out.println();

        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
    }
}