package homework16;

//Given a string which include parentheses  ( ) [ ] { }.
//Check is balanced parentheses

public class task5 {
    public static String parenthesesChecker(String x) {

        if (x == null) {
            return null;
        }

        int count1 = 0;

        for (int i = 0; i < x.length(); i++) {
            char y = x.charAt(i);

            if (y == '(') {
                count1++;

            } else if (y == ')') {
                count1--;
            }
            if (count1 < 0) {
                return "it is not balanced open the parenthesis";
            }
        }

        int count2 = 0;
        for (int j = 0; j < x.length(); j++) {
            char y = x.charAt(j);

            if (y == '[') {
                count2++;

            } else if (y == ']') {
                count2--;
            }
            if (count2 < 0) {
                return "it is not balanced open the parenthesis";
            }
        }
        if (count2 > 0) {
            return "it is not balanced close the parenthesis";
        }

        int count3 = 0;
        for (int j = 0; j < x.length(); j++) {
            char y = x.charAt(j);

            if (y == '{') {
                count3++;

            } else if (y == '}') {
                count3--;
            }
            if (count3 < 0) {
                return "it is not balanced open the parenthesis";
            }
        }
        if (count3 > 0) {
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
        System.out.println(parenthesesChecker("{}"));
        System.out.println(parenthesesChecker("}"));
        System.out.println(parenthesesChecker("{"));
        System.out.println(parenthesesChecker("["));
        System.out.println(parenthesesChecker("]"));
        System.out.println(parenthesesChecker("][]"));

    }
}