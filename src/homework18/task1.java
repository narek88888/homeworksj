package homework18;
//Write a generic method to exchange the positions of two different elements in an array.

import java.util.ArrayList;
import java.util.Arrays;

public class task1 {
    public static <T> T[] exchangePositions(T[] x, int y, int z) {


        T Indexsaver;
        if (y < x.length && z < x.length && y >= 0 && z >= 0) {
            Indexsaver = x[y];
            x[y] = x[z];
            x[z] = Indexsaver;


        }
        return x;
    }

    public static void main(String[] args) {
        Integer[] b = {1,2,3,4,5};
        System.out.println(Arrays.toString(exchangePositions(b, 0, 1)));
    }
}
