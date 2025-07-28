package homework9;
import java.time.*;
import java.util.Arrays;
import java.util.Scanner;

public class time {


    public static void main(String[] args){

        //1. Use LocalDate.now() to print today’s date.
        System.out.println(LocalDate.now());

        //2

        System.out.println(parseTheString("2025-12-31"));

        //3.
        LocalDate date2 = LocalDate.parse("2007-12-22");
        LocalDate date3 = LocalDate.parse("2025-07-27");
        System.out.println(calculate(date2, date3));


        //4

        LocalDate date4 = LocalDate.of(2025, 7,27);
        Period period = Period.ofDays(100);
        date4 = date4.plus(period);

        System.out.println(add_to_the_date(date4, period));


        //5.Use LocalTime.now() to display the current system time.

        System.out.println(LocalTime.now());


        //6.

        System.out.println(printZoneDateTime1("Asia/Tokyo"));
        System.out.println(printZoneDateTime1("America/New_York"));
        System.out.println(printZoneDateTime1("Asia/Yerevan"));




        //7.

        ZonedDateTime yerevanTime = ZonedDateTime.parse("2025-07-26T14:00+04:00[Asia/Yerevan]");
        System.out.println(printZoneDateTime2(yerevanTime, "Europe/London"));



        //8
        LocalTime x = LocalTime.parse("08:00");
        LocalTime y = LocalTime.parse("15:45");

        System.out.println(find_the_difference(x,y));

        //10
        String[] zones1 = ZoneId.getAvailableZoneIds().toArray(new String[0]);
        String[] zones2 = new String[zones1.length];
        for (int i = 0; i < zones1.length; i++) {
            zones2[i] = zones1[i];
        }
        System.out.println(Arrays.toString(zones2));



        //9. Ask the user to enter a date and tell whether it’s a Saturday or Sunday using getDayOfWeek().

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date (yyyy-MM-dd): ");

        String inputDate = scanner.nextLine();

        LocalDate date = LocalDate.parse(inputDate);

        DayOfWeek dayOfWeek = date.getDayOfWeek();

        if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY){
            System.out.println(dayOfWeek);
        }
        else{
            System.out.println("it is not a weekend");

        }

        //10․ Print all available time zone IDs using ZoneId.getAvailableZoneIds().

       //it is written before 9 task



    }

    //2. Parse the string "2025-12-31" into a LocalDate object and print it.

    /**
     * this method is used to parse the date to LocalDate object
     * @param x
     * @return LocalDate
     */
    public static LocalDate parseTheString(String x){
        return LocalDate.parse(x);
    }

    //3.Given your birthdate as a string (e.g., "2000-06-15"), calculate and print your age in years using Period.between(...)

    /**
     * this method is used to print your age giving your date of birth
     * @param x
     * @param y
     * @return your age
     */
    public static int calculate(LocalDate x, LocalDate y){
        return Period.between(x, y).getYears();
    }

    //4.Input  a date and add 100 days to it. Print the new date.

    /**
     * this method is used to add 100 days to the given date
     * @param x
     * @param y
     * @return 100 days added date
     */

    public static LocalDate add_to_the_date(LocalDate x, Period y){
        return x.plus(y);
    }

    //6. Print the current time in Tokyo, New York,
    // and Yerevan using ZonedDateTime.now(ZoneId.of(...)).

    /**
     * this method is used to print zone datetime now
     * @param x
     * @return zone datetime
     */

    public static ZonedDateTime printZoneDateTime1(String x){
        return ZonedDateTime.now(ZoneId.of(x));
    }

    //7.You have a meeting at 2025-07-26T14:00 in Yerevan.
    // Convert this time to London and Los Angeles time using

    /**
     * this method is used to print the zone datetime in the correct country and the same datetime in the other countries
     * @param x
     * @param y
     * @return given datetime in the other countries
     */

    public static ZonedDateTime printZoneDateTime2(ZonedDateTime x, String y){
        return x.withZoneSameInstant(ZoneId.of(y));


    }

    //8. Given two LocalTime values (e.g., 08:00 and 15:45), calculate the time difference using Duration.between().

    /**
     * this method is used to calculate the time difference
     * @param x
     * @param y
     * @return the given time difference
     */

    public static Duration find_the_difference(LocalTime x, LocalTime y){
        return Duration.between(x,y);
    }

    //9.Ask the user to enter a date and tell whether it’s a Saturday or Sunday using getDayOfWeek().
    // it is written in main method

     //10․ Print all available time zone IDs using ZoneId.getAvailableZoneIds().
    // it is written in main method






}
