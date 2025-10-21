package homework17;
//Define HashMap
//17.Copy Map Values into a List (Similar to "Copy list values into another"):
// Write a method that takes a HashMap<String, Integer> as input and returns an
// ArrayList<Integer> containing all the values from the map. The order of values
// in the list does not matter.

import java.util.ArrayList;
import java.util.HashMap;

public class task17 {
    public static ArrayList<Integer> copyValues(HashMap<String, Integer> x){
        ArrayList<Integer> y = new ArrayList<>();
        y.addAll(x.values());
        return y;

    }

    public static void main(String[] args) {
        HashMap<String, Integer> c = new HashMap<>();
        c.put("A", 1);
        c.put("B", 2);
        c.put("C", 3);
        c.put("D", 4);
        System.out.println(copyValues(c));
    }
}
