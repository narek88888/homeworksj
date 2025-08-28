package homework13;

/*
Write a program that reads an integer number and  calculates
 and prints its square root. If the number is  invalid or negative
 , print "Invalid number". In all  cases finally print "Good bye". Use try-catch-finally.


 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task5 {
    public static void printSquareRoot(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("write a number");




        try {
            int input = scanner.nextInt();
            if(input >= 0){
                System.out.println(Math.sqrt(input));

            }else {
                throw new  ArithmeticException();
            }
        }catch (ArithmeticException e){
            System.out.println("Invalid number");
        }
        catch (InputMismatchException e){
            System.out.println("Invalid number");
        }
        finally {
            System.out.println("Good bye");
        }
    }

    public static void main(String[] args){
        printSquareRoot();
    }
}

