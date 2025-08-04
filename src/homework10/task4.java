package homework10;

//4.Create a class with a final static field that is initialized with
// the current date and time. Write a program that calculates the number
// of seconds that have elapsed since the field was initialized.

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class task4 {
     class F{
         static final LocalDateTime start = LocalDateTime.now();

    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("start" + " " + F.start);
        Thread.sleep(15000);

        LocalDateTime now = LocalDateTime.now();


        System.out.println("now" + " " + now);

        Duration duration = Duration.between(F.start, now);

        long x = duration.getSeconds();

        System.out.println(x);



    }

}
