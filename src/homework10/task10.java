package homework10;

//10.Create a class with a static final field
// that is initialized with a large prime number.
// Write a program that calculates the next prime
// number after the value of the field.

public class task10 {
    class Prime{
        static final long largePrimeNumber = 5323;

    }

    public static void main(String[] args){
        if(Prime.largePrimeNumber % 2 == 0){
            System.out.println("it is not a prime number");
        }
        else{
            System.out.println(Prime.largePrimeNumber + 2);
        }

    }

}
