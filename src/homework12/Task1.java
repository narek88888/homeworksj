package homework12;
/*
Exercise 1 (Days of the week)
Create an enum called "Day" that contains values for the days of the week.
Then, write a class that prints whether a given day is a weekday or weekend.

 */


    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY

    }



    class Check {
        public void checkDay(Day day){
            if(day == Day.SATURDAY || day == Day.SUNDAY ){
                System.out.println("Weekend");
            }
            else {
                System.out.println("Weekday");
            }

        }
    }

    public class Task1{
        public static void main(String[] args){
            Check check = new Check();
            check.checkDay(Day.SUNDAY);
            check.checkDay(Day.SATURDAY);
            check.checkDay(Day.MONDAY);

        }
    }



