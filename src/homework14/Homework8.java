package homework14;
/*
Write a program to create an anonymous inner class that extends a specific class and overrides a method.

 */

public class Homework8 {
    abstract class Anonymous{
        abstract void test1();
    }

    void test2(){
        Anonymous anonymous = new Anonymous() {
            @Override
            void test1() {
                System.out.println("override");
            }
        };
        anonymous.test1();
    }

    public static void main(String[] args) {
        Homework8 homework8 = new Homework8();
        homework8.test2();


    }

}
