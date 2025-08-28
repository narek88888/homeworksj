package homework13;

/*
Write a program that reads an integer from the user
 and prints its reciprocal. If the user enters 0,
  the program should throw an exception and print an error message.

 */

import java.util.Scanner;

public class Task1 {

    public static void printReciprocal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write an integer ");
        int input = scanner.nextInt();


        try {
            if (input == 0) {
                throw new ArithmeticException();
            } else{
                System.out.println((1.0 / input));
            }
        } catch (ArithmeticException e) {
            System.out.println("can't divide by zero");
        }



    }

    public static void main(String[] args){
         printReciprocal();
    }




}


