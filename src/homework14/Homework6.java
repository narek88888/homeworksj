package homework14;

/*
Write a program to create a nested class with multiple levels of nesting and access its methods.

 */

public class Homework6 {

    class A{
        void printA(){
            System.out.println("A");
        }
        class B{
            void printB(){
                System.out.println("B");
            }
            class C{
                void printC(){
                    System.out.println("C");
                }

            }
        }
    }

    public static void main(String[] args) {
        Homework6 homework6 = new Homework6();
        Homework6.A x = homework6.new A();
        A.B y = x.new B();
        A.B.C z = y.new C();

        x.printA();
        y.printB();
        z.printC();


    }

}
