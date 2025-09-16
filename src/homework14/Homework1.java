package homework14;

/*
1.Write a program to create a simple nested class inside a main class and access its methods.
 */

public class Homework1 {
    class A{
        void printHello(){
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {
        Homework1 homework1 = new Homework1();
        Homework1.A a = homework1.new A();

        a.printHello();

    }

}
