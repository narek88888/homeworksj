package homework10;
import java.util.Random;
import java.util.Scanner;

//3.Create a class with a static field that is initialized with
// a random value between 1 and 100. Write a program that allows
// the user to guess the value of the field. The program should
// provide feedback to the user indicating whether the guess is too
// high, too low, or correct.

public class task3 {
    class D{
        static Random rand = new Random();
        static int randomValue = rand.nextInt(100);

    }

    public static void main(String[] args){
        System.out.println(D.randomValue);
        Scanner scanner = new Scanner(System.in);

        System.out.print("write number between 1 to 100" + " ");
        int number = scanner.nextInt();
        System.out.println("you have written " + number);

        if(number < D.randomValue){
            System.out.println("too low");
        }
        if(number > D.randomValue){
            System.out.println("too high");
        }

        if (number == D.randomValue){
            System.out.println("correct");
        }



    }


}
