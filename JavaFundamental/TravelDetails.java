import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter from city: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter via city: ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter to city: ");
        String toCity = scanner.nextLine();

        System.out.print("Enter distance from city to via city (in Miles): ");
        double distanceFromToViaMiles = scanner.nextDouble();

        System.out.print("Enter distance from via city to final city (in Miles): ");
        double distanceViaToFinalCityMiles = scanner.nextDouble();

        System.out.print("Enter time taken from city to via city (in minutes): ");
        int timeFromToVia = scanner.nextInt();

        System.out.print("Enter time taken from via city to final city (in minutes): ");
        int timeViaToFinalCity = scanner.nextInt();

        double totalDistanceMiles = distanceFromToViaMiles + distanceViaToFinalCityMiles;
        double totalDistanceKm = totalDistanceMiles * 1.60934; // Convert miles to km

        int totalTimeMinutes = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + String.format("%.2f", totalDistanceKm) + " km and the Total Time taken is " + totalTimeMinutes + " minutes");

        scanner.close();
    }
}