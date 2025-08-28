package homework13;

/*
Write a program that prompts the user to enter their age.
 If the user enters an age that is negative or greater than 120,
  the program should throw an exception and print an error message.

 */

import java.util.Scanner;

class ExceptionOfAge extends Exception{}

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age ");
        int input = scanner.nextInt();

        try {
            if(input < 0 || input > 120){
                throw new ExceptionOfAge();

            }
        } catch (ExceptionOfAge e) {
            System.out.println("age must not be negative or greater than 120");
        }
    }


}
