package homework13;

/*
Write a program that reads two integers from the user and calculates their quotient.
 If the second integer is 0 or negative, the program should throw an exception and
  print an error message.

 */

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write first number");

        int num1 = scanner.nextInt();

        System.out.println("write second number");

        int num2 = scanner.nextInt();

        try {
            if(num2 == 0 || num2 < 0){
                throw new ArithmeticException();
            }
            else {
                System.out.println("result: " + num1 / num2);
            }
        } catch (ArithmeticException e) {
            System.out.println("the second number must not be 0 or negative");
        }
    }
}
