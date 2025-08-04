package homework10;

import java.util.Random;

//6.Create a class with a static method that accepts two strings and
// returns a string that contains all the characters that appear in
// both strings. Use this method in another class to find the common
// characters in two randomly generated strings.

public class task6 {
    class A{
        public static String doTask(String x, String y){
            String a = "Davo";
            if(a.contains(x) && a.contains(y)){
                return a;

            }
            else{
                return "that String does not contains all the characters that both of them have";
            }

        }

        class B {

        }


    }

    public static void main(String[] args){
        System.out.println(A.doTask("Gago", "Davo"));

    }



}
