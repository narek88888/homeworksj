package homework14;

/*
2.Write a program to create a member inner class inside a main class and access its methods.
 */

public class Homework2 {
    class B {
        void printWorld(){
            System.out.println("World");
        }
    }

    public static void main(String[] args) {
        Homework2 homework2 = new Homework2();
        Homework2.B x = homework2.new B();

        x.printWorld();
    }

}
