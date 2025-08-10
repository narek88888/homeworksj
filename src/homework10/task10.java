package homework10;



//10.Create a class with a static final field
// that is initialized with a large prime number.
// Write a program that calculates the next prime
// number after the value of the field.



public class task10 {
    class Prime{
        static final long largePrimeNumber = 13;


        }

        public static void main(String[] args) {

            long x = Prime.largePrimeNumber;


            for (int i = 2; i <= Math.sqrt(x); i++) {
                if(x % i == 0){
                    System.out.println("it is not a prime number");
                    break;
                }
                else {
                    System.out.println("it is prime");
                    break;
                }



            }



        }



















    }



