package homework13;

/*

  Write a program that reads a file name from the user and counts the
  number of words in the file. If the file does not exist or cannot be opened,
  the program should throw an exception and print an error message.

*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("write the file name");

        String fileName = scanner.nextLine();

        File file = new File(fileName);

        try(Scanner fileScanner = new Scanner(file)) {

            if(!file.exists()){
                throw new FileNotFoundException();
            }
            int count = 0;
            while (fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                String[] words = line.trim().split("\\s+");


                if (!line.trim().isEmpty()){
                    count+= words.length;

                }
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            System.out.println("the file does not exist or cannot be opened");
        }

    }
}