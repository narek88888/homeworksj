package homework16;

//Given a string which include parentheses  ( ) [ ] { }.
//Check is balanced parentheses

public class task5 {
    public static String parenthesesChecker(String x) {

        if (x == null) {
            return null;
        }

        int count = 0;

        for (int i = 0; i < x.length(); i++) {
            char y = x.charAt(i);

            if (y == '(') {
                count++;

            } else if (y == ')') {
                count--;
            }
            if (count < 0) {
                return "it is not balanced open the parenthesis";
            }
        }
        if (count > 0) {
            return "it is not balanced close the parenthesis";
        }

        return "it is balanced";

    }

    public static void main(String[] args) {
        System.out.println(parenthesesChecker("()"));
        System.out.println(parenthesesChecker("("));
        System.out.println(parenthesesChecker(")"));
        System.out.println(parenthesesChecker("()("));
        System.out.println(parenthesesChecker("())"));
    }
}