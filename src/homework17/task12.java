package homework17;

import java.util.LinkedList;

//.12.Find the Middle Node
public class task12 {
    public static String findTheMiddleNode3(LinkedList<String> x) {
        if(x == null || x.size() == 0){
            return null;
        }

        double result = 0;
        if(x.size() != 1 && x.size() != 2){
            result =  x.size() / 2;
            return x.get((int) Math.floor(result));
        }
        return "there is not middle node";

    }

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("John");
        names.add("Jenifer");
        names.add("David");
        names.add("Angel");

        System.out.println(findTheMiddleNode3(names));
    }
}