package homework17;

import java.util.LinkedList;

//11.Reverse a LinkedList
public class task11 {
    public static LinkedList<String> reverseLinkedList(LinkedList<String> x){
        LinkedList<String> reversed = new LinkedList<>();

        for (int i = x.size() - 1; i >= 0; i--) {
            reversed.add(x.get(i));
        }
        return reversed;
    }

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("John");
        names.add("Jenifer");
        names.add("David");
        names.add("Angel");
        System.out.println(reverseLinkedList(names));
    }

}
