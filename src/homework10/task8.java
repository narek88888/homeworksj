package homework10;

import java.util.Random;

//8.Create a class with a final method that accepts an integer
// parameter and returns a string representation of the integer
// in binary format. Use this method in another class to convert
// a randomly generated integer to binary format.

public class task8 {

    class Binary {
        public final String printBinary(int n) {
            return Integer.toBinaryString(n);
        }

    }

        class Randomly{
            Random random = new Random();
            int y = random.nextInt(2001);
        }


    

    public static void main(String[] args){
        task8 x = new task8();

        Binary binary = x.new Binary();
        Randomly randomly = x.new Randomly();

        System.out.println(binary.printBinary(10));
        System.out.println(binary.printBinary(binary.printBinary(randomly.y)));
    }

}






