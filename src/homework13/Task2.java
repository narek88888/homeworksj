package homework13;

/*

Write a program that accepts an array of integers from
 the user and calculates the sum of its elements.
  If the user enters a non-integer value, the program
   should throw an exception and print an error message.

 */

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {

    public static void calculate() throws InputMismatchException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the quantity of elements ");

        int size = scanner.nextInt();

        int[] nums = new int[size];

        System.out.println("Write " + size + " elements ");

        for(int i = 0; i < size; i++){
            nums[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
        }

        System.out.println("you created such an array " + Arrays.toString(nums));
        System.out.println("and the sum of your array is " + sum);


    }

    public static void main(String[] args){


        try {
            calculate();
        }catch (InputMismatchException e){
            System.out.println("you can give only integer");
        }
    }

}
