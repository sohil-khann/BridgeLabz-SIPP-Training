package JavaConstructor;

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Guest";
        this.roomType = "Standard";
        this.nights = 1;
        System.out.println("Default HotelBooking constructor called.");
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
        System.out.println("Parameterized HotelBooking constructor called.");
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
        System.out.println("Copy HotelBooking constructor called.");
    }

    public void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        // Create a booking using the default constructor
        HotelBooking booking1 = new HotelBooking();
        booking1.displayBookingDetails();
        System.out.println("\n");

        // Create a booking using the parameterized constructor
        HotelBooking booking2 = new HotelBooking("John Doe", "Deluxe", 3);
        booking2.displayBookingDetails();
        System.out.println("\n");

        // Create a new booking using the copy constructor
        HotelBooking booking3 = new HotelBooking(booking2);
        booking3.displayBookingDetails();
    }
}