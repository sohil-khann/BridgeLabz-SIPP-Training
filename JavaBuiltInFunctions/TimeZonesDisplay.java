import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZonesDisplay {

    public static void main(String[] args) {
        // Get current time in default system zone
        ZonedDateTime now = ZonedDateTime.now();

        // Define formatters
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        // GMT (Greenwich Mean Time)
        ZoneId gmtZone = ZoneId.of("GMT");
        ZonedDateTime gmtTime = now.withZoneSameInstant(gmtZone);
        System.out.println("Current time in GMT: " + gmtTime.format(formatter));

        // IST (Indian Standard Time)
        ZoneId istZone = ZoneId.of("Asia/Kolkata"); // Or "IST" if supported by your JVM
        ZonedDateTime istTime = now.withZoneSameInstant(istZone);
        System.out.println("Current time in IST: " + istTime.format(formatter));

        // PST (Pacific Standard Time)
        ZoneId pstZone = ZoneId.of("America/Los_Angeles"); // Or "PST" if supported by your JVM
        ZonedDateTime pstTime = now.withZoneSameInstant(pstZone);
        System.out.println("Current time in PST: " + pstTime.format(formatter));
    }
}