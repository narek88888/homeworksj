package homework10;
import java.util.Arrays;
import java.util.Random;


//2.Create a class with a static method that accepts an array of integers
// and returns the index of the maximum value in the array. Use this method
// in another class to find the index of the maximum value in a randomly
// generated array of integers.

public class task2 {

    class B {
        public static int findTheMaximumValue(int[] x) {
            int max = x[0];
            int maxIndex = 0;
            for (int i = 0; i < x.length; i++) {
                if (x[i] > max) {
                    max = x[i];
                    maxIndex = i;


                }

            }
            return maxIndex;


        }
    }

    class C {
        public static int[] generateRandomArray(int size) {
            int[] arr = new int[size];
            Random rand = new Random();

            for (int i = 0; i < size; i++) {
                arr[i] = rand.nextInt(100);

            }
            return arr;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[] {1, 20, 5000, 7};


        int[] randomArray = C.generateRandomArray(10);

        System.out.println(B.findTheMaximumValue(a));


        System.out.println(Arrays.toString(randomArray));

        System.out.println(B.findTheMaximumValue(randomArray));


    }
}


