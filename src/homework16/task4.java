package homework16;

//Given an array of strings and a string.
//Determines whether it is possible to create a string from this array.

import java.lang.reflect.Array;

public class task4 {

    public static void arrayChecker(String[] x, String y) {
        StringBuilder collection = new StringBuilder();

        for (String v : x) {
            collection.append(v);
        }
        if(collection.toString().equals(y)){
            System.out.println("it is possible to create a string from that array");
        }else {
            System.out.println("it isn't possible to create a string from that array");
        }
    }


    public static void main(String[] args) {
        String[] s1 = {"Na","r", "e","k"};
        String[] s2 = {"Na","r","k"};
        String g = "Narek";
        arrayChecker(s1,g);
        arrayChecker(s2,g);
    }
}
