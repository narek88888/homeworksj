package homework10;
import java.util.Random;


//6.Create a class with a static method that accepts two strings and
// returns a string that contains all the characters that appear in
// both strings. Use this method in another class to find the common
// characters in two randomly generated strings.
public class task6 {
     class A {

        public static StringBuilder check(StringBuilder a, StringBuilder b){
            String all1 = "`~!@#$%^&*()_+qwertyuiopQWERTYUIOPasdfghjklASDFGHJKLzxcvbnmZXCVBNM[]{};',.<>/?1234567890/*-+ ";
            StringBuilder x = new StringBuilder();

            for(int i = 0; i < all1.length(); i++){
                char c  = all1.charAt(i);
                if(a.toString().contains(String.valueOf(c)) && b.toString().contains(String.valueOf(c))){
                    x.append(c);
                }

            }
            return x;

        }

    }

    class B {
   public static StringBuilder giveSize(int length){

       String all2 = "`~!@#$%^&*()_+qwertyuiopQWERTYUIOPasdfghjklASDFGHJKLzxcvbnmZXCVBNM[]{};',.<>/?1234567890/*-+ ";

       Random random = new Random();

       StringBuilder x = new StringBuilder(length);




       for (int i = 0; i < length; i++) {
           int h = random.nextInt(all2.length());
           x.append(all2.charAt(h));

       }
       return x;

        }

    }

    public static void main(String[] args){

         StringBuilder name1 = new StringBuilder("Saqo");
         StringBuilder name2 = new StringBuilder("Simon");

        System.out.println(A.check(name1, name2));


        System.out.println(A.check(B.giveSize(10), B.giveSize(10) ));

    }



}
