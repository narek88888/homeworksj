package homework14;
/*
Write a program to create a local inner class that accesses a final variable declared in the method.

 */

public class Homework9 {
    void test1(){
        final String kingOFAnimal = "Lion";
        class A{
            void test2(){
                System.out.println(kingOFAnimal);
            }

        }
        A a = new A();
        a.test2();
    }

    public static void main(String[] args) {
        Homework9 homework9 = new Homework9();
        homework9.test1();
    }

}
