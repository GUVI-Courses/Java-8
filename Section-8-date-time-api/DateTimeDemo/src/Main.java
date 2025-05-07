import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        //LocalDate
        LocalDate today = LocalDate.now();
        //System.out.println("Todays date is: "+today);

        //Create a specific date
        LocalDate independenceDay = LocalDate.of(1947, Month.AUGUST,15);
        //System.out.println("Independence Day: "+independenceDay);

        //LocalTime
        LocalTime nowTime = LocalTime.now();
        //System.out.println("Current Time is: " + nowTime);

        //Specific Time
        LocalTime lunchTime = LocalTime.of(13,0);
        //System.out.println("Luch Time is: "+lunchTime);

        //LocalDateTime
        LocalDateTime meeting = LocalDateTime.of(today,lunchTime);
        //System.out.println("Meeting Time is: "+meeting);

        //ZonedDateTime
        ZonedDateTime zonedNow = ZonedDateTime.now();
        //System.out.println("Zoned Date Time: "+zonedNow);

        //Convert to another time zone
        ZonedDateTime newYorkTime = zonedNow.withZoneSameInstant(ZoneId.of("America/New_York"));
        //System.out.println("Time in New York is: "+newYorkTime);

        //Duration
        Duration duration = Duration.between(LocalTime.of(9,0), LocalTime.of(17,30));
        //System.out.println("Work duration: "+duration.toHours()+"hours and "+duration.toMinutes()+" minutes");

        //Period
        Period period = Period.between(independenceDay,today);
        //System.out.println("Years since independence:" + period.getYears());

        //Formatting date/time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formatted = meeting.format(formatter);
        //System.out.println("Formatted meeting time "+formatted);
        //System.out.println(meeting);

        //Parsing from string
        String input = "31-12-2025 23:59";
        LocalDateTime parsedDate = LocalDateTime.parse(input,formatter);
        //System.out.println("Parsed DateTime: "+parsedDate);

        //Schedulting Feature - Hands on project

        System.out.println("\n--------Scheduling Feature--------");

        LocalDateTime futureMeeting = LocalDateTime.now().plusDays(5).withHour(10).withMinute(0);
        //System.out.println("Meeting scheduled for : "+futureMeeting.format(formatter));

        LocalDateTime reminderTime = futureMeeting.minusDays(1);
        System.out.println("Reminder will be sent at: "+reminderTime.format(formatter));

        long hoursUntilMeeting = ChronoUnit.HOURS.between(LocalDateTime.now(),futureMeeting);
        System.out.println("Hours until meeting: "+ hoursUntilMeeting);




    }
}