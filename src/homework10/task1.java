package homework10;


//1.Create a class with a private static field and a public static method that
// modifies the value of the field. Write a test class to verify that the value
// of the field is correctly updated.

public class task1 {

    class A {
        private static int i;

        public static int modifyValueOfTheField(int x) {
            i = x;
            return i;

        }

        public static void main(String[] args){
            System.out.println(A.modifyValueOfTheField(10));
        }
    }
}
