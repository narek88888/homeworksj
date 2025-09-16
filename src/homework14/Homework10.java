package homework14;
/*
Write a program to create a static nested class that accesses a static method of the main class.

 */

public class Homework10 {
    static void test1(){
        System.out.println("Hello");
    }
    static class A{
        void test2(){
            test1();
        }

    }

    public static void main(String[] args) {
        A a = new A();
        a.test2();
    }
}
