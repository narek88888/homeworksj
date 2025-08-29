package homework13;

/*
 * Write a program that reads an input string from the user and performs
 *  a series of operations on it, such as converting it to uppercase,
 *  reversing it, and counting the number of vowels. However, if the
 *  input string is empty or null, or if any of the operations fail
 * due to invalid input, your program should handle these cases and
 * throw appropriate exceptions with clear error messages.

 */

import java.util.Scanner;
class ExceptionForEmpty extends Exception{}



public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write a word");
        String input = scanner.nextLine();

        try {
            if(input == null || input.length() == 0){
                throw new ExceptionForEmpty();
            }
            else {
                System.out.println(input.toUpperCase());

            }
        } catch (ExceptionForEmpty e) {
            System.out.println("it can't be empty or null");

        }
    }
}
