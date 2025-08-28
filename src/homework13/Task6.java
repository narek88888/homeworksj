package homework13;

/*
Create three new types of exceptions.
 Write a method that throws all three.
  In main( ), call the method but only
   use a single catch clause that will
   catch all three types of exceptions.
 */

class ExceptionOne extends Exception{

}

class ExceptionTwo extends Exception{

}

class ExceptionThree extends Exception{

}

public class Task6 {
    public static int g() throws ExceptionOne, ExceptionTwo, ExceptionThree{
        throw new ExceptionTwo();
    }

    public static void main(String[] args) {
        try {
            g();
        } catch (ExceptionOne | ExceptionTwo | ExceptionThree e) {

            System.out.println("caught");
        }
    }
}