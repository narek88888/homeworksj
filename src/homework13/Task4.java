package homework13;

/*
Write a program that reads a file name from
 the user and prints its contents to the console.
  If the file does not exist or cannot be opened,
   the program should throw an exception and print
    an error message.

 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;




public class Task4 {

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter the file name");

        String fileName = inputScanner.nextLine();

        File file = new File(fileName);

        try(Scanner fileScanner = new Scanner(file) ) {

            if (!file.exists()) {
                throw new  FileNotFoundException();

            }
            while (fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                System.out.println(line);
            }


        }catch (FileNotFoundException e1){
            System.out.println("file doesn't exist or can't be opened");

        }finally {
            inputScanner.close();

        }







    }
    }

