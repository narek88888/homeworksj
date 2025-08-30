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
class InvalidString extends Exception{};



public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write a word");
        String input = scanner.nextLine();
        char[] vowels = new char[]{'I', 'U', 'O', 'E', 'A'};
        String letters = "qwertyuiopasdfghjklzxcvbnm";


        try {
            if (input.length() == 0 || input == null) {
                throw new NullPointerException();

            }

            for (int i = 0; i < input.length(); i++) {
                char v = input.charAt(i);
                if(!Character.isLetter(v)){
                    throw new  InvalidString();
                }

            }


            String upperCase = input.toUpperCase();
            System.out.println(upperCase);

            StringBuilder stringBuilder = new StringBuilder(upperCase).reverse();
            System.out.println(stringBuilder);


            int count = 0;

            for (char i : vowels) {
                if (upperCase.indexOf(i) != -1) {
                    count++;

                }
            }

            System.out.println(count);


        } catch (NullPointerException e2) {
            System.out.println("it can't be null or empty");


        } catch (InvalidString e) {
            System.out.println("invalid String");
        }
    }
}
