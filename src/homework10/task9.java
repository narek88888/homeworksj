package homework10;
import java.util.Arrays;
import java.util.Random;

//9.Create a class with a static method that accepts an array of
// integers and returns a new array containing only the even numbers.
// Use this method in another class to filter out the even numbers in
// a randomly generated array of integers.

public class task9 {
    class Array{

        public static int[] printEvens(int[] x){
            int[] evens = new int[x.length];

            for(int i = 0; i < x.length; i++){
                if(x[i] % 2 == 0 ){
                    evens[i] = x[i];
                }

            }
            return evens;
        }

    }

    public static void main(String[] args){
        Random random = new Random();

        int[] numbers1 = new int[20];

        for (int i = 0; i < numbers1.length; i++) {
            numbers1[i] = random.nextInt(50);

        }

        int[] numbers2 = new int[] {1,2,3,4,5,6,7,8,10};

        System.out.println(Arrays.toString(Array.printEvens(numbers2)));
        System.out.println(Arrays.toString(Array.printEvens(numbers1)));



    }


    }




