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




public class Order {
 String value = "t";
 { value += "a"; }
 { value += "c"; }
 public Order() {

         value += "b";
         }
 public Order(String s) {
         value += s;
         }
 public static void main(String[] args) {
         Order order = new Order("f");
         order = new Order();
         System.out.println(order.value);
         } }










