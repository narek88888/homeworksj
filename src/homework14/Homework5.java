package homework14;

/*
Write a program to create a static nested class inside a main class and access its methods.

 */

public class Homework5 {



    static class D{
        void test1(){
            System.out.println("Java");
        }

        static void test2(){
            System.out.println("Python");
        }
    }

    public static void main(String[] args) {
        D d = new D();
        d.test1();
        D.test2();



    }

}
