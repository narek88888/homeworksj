package homework17;

import java.util.Stack;

//Reverse a string by pushing characters onto a stack and popping them back.
public class task16 {
    public static Stack<String> reverse(Stack<String> x){
        Stack<String> temp = new Stack<>();
        for (int i = x.size() - 1; i >= 0; i--){
            String g = x.pop();
            temp.push(g);
        }
        return temp;
    }

    public static void main(String[] args) {
        Stack<String> v = new Stack<>();
        v.push("A");
        v.push("B");
        v.push("C");
        v.push("D");
        v.push("E");

        System.out.println(reverse(v));


    }
}
