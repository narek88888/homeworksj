package homework13;

/*

Write a program that reads two numbers from the user
and divides them. If the user enters 0 as the second
number, the program should throw an exception and print an error message.

 */

import java.util.Scanner;

public class Task3{

    public static void divide() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write two numbers ");

        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();



        try {
            if(input2 == 0){
                throw new ArithmeticException();
            }
            else { System.out.println("result: " + input1 / input2);
            }

        } catch (ArithmeticException e) {
            System.out.println("can't be divided by 0");
        }
        }

    public static void main(String[] args){

    divide();





    }

    }






