package homework10;

import java.util.Random;

//Create a class with a static method that recursively calculates the factorial
// of a given integer. Use this method in another class to calculate the factorial
// of a randomly generated integer

public class task7 {
    class Factorial{
        public static int calculateFactorial(int x){
            if(x == 0 || x == 1){
                return 1;
            }
            else{
                return x * calculateFactorial(x - 1);
            }
        }
    }

    class Randomly{

        static Random random = new Random();

         static int randomNumber = random.nextInt(11);


    }
    public static void main(String[] args){
        System.out.println(Factorial.calculateFactorial(5));
        System.out.println(Factorial.calculateFactorial(Factorial.calculateFactorial(Randomly.randomNumber)));
    }


}
