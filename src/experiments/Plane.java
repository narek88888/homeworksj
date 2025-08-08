package experiments;





    /*
 public static void main(String[] args) {
         int number = 1; // 1
         String letters = "abc"; // abc
         number  = number(number); // 1
         letters = letters(letters); // abcd
         System.out.println(number + letters); // 1abcd
         }
 public static int number(int number) {
         number++;
         return number;
         }
 public static String letters(String letters) {
         letters += "d";
         return letters;
         }


     */




public class Plane {
    public void fly(int i) {
        System.out.print("int ");
    }
    public void fly(long l) {
        System.out.print("long ");
    }
    public static void main(String[] args) {
        Plane p = new Plane();
        p.fly(123);
        p.fly(123L);
    } }











