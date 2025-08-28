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


class FileReadException extends Exception{}

public class Task4 {

    public static void printFileContent(String fileName) throws FileNotFoundException, FileReadException {
        File file = new File(fileName);

        if (!file.exists()) {
            throw new FileNotFoundException();
        }
            try (Scanner fileScanner = new Scanner(file)) {
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    System.out.println(line);

                }
            } //catch (FileReadException e) {
                throw new  FileReadException();

            }


    }

