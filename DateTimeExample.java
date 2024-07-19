Example:
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.Instant;
import java.time.ZoneId;
public class DateTimeExample {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);        
        // Get the current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);        
        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
            
        // Get the current date and time in a specific time zone
        ZonedDateTime currentDateTimeInParis = 
ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Current Date and Time in Paris: " +  
currentDateTimeInParis);
    }
}
