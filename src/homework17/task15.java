package homework17;

import java.util.Stack;

//Define Stack
//15.Check if a string containing (), {}, or [] has balanced brackets using a stack.
public class task15 {
    public static Boolean checkTheBalance(Stack<String> x){
        if(x == null){
            return null;
        }
        int count = 0;
        for (int i = 0; i < x.size(); i++) {
            String s = x.get(i);
            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                if(ch == '('){
                    count++;
                } else if (ch == ')') {
                    count--;
                }

                if(count < 0){
                    return false;
                }

            }


            if(count > 0){
                return false;
            }

            int count2 = 0;
            for (int v = 0; v < s.length(); v++) {
                char ch = s.charAt(v);

                if(ch == '['){
                    count2++;
                } else if (ch == ']') {
                    count2--;
                }
                if(count2 < 0){
                    return false;
                }
            }

            if(count2 > 0){
                return false;
            }
            int count3 = 0;
            for (int k = 0; k < s.length(); k++) {
                char ch = s.charAt(k);

                if(ch == '{'){
                    count3++;
                } else if (ch == '}') {
                    count3--;
                }

                if(count3 < 0){
                    return false;
                }
            }
            if(count3 > 0){
                return false;
            }
            }
        return true;




    }

    public static void main(String[] args) {
        Stack<String> u = new Stack<>();
        u.add("()(){}[]");
        u.add("()(}]");
        System.out.println(checkTheBalance(u));


    }
}
