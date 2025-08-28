package homework13;

/*
Write a program that reads a string from the user and checks
if it is a valid email address. If the string is not a valid
email address, the program should throw an exception and print an error message.

 */


import java.util.Scanner;

class InvalidEmailException extends Exception{}

public class Task8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email ");
        String email = scanner.nextLine();


        int atIndex = email.indexOf('@');
        int lastDotIndex = email.lastIndexOf('.');

        try {
            if (atIndex <= 0 || lastDotIndex >= email.length() - 1) {
                throw new InvalidEmailException();
            }


            if (lastDotIndex < atIndex || lastDotIndex == atIndex + 1) {
                throw new InvalidEmailException();
            }

            System.out.println("Valid email");



        } catch (InvalidEmailException e) {
            System.out.println("Invalid email");


        }
    }


    }

