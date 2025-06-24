package JavaConstructor;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
        System.out.println("CarRental constructor called.");
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: $" + dailyRate);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        // Create a car rental booking
        CarRental rental1 = new CarRental("Jane Doe", "Toyota Camry", 5, 45.00);
        rental1.displayRentalDetails();
        System.out.println("\n");

        CarRental rental2 = new CarRental("Peter Jones", "Honda Civic", 3, 40.00);
        rental2.displayRentalDetails();
    }
}