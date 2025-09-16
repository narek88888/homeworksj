package homework14;

/*
3.Write a program to create a local inner class inside a method and access its methods.

 */

public class Homework3 {

    void test(){
        class C{
            void printEngineer(){
                System.out.println("Engineer");
            }
        }
        C c = new C();
        c.printEngineer();


    }

    public static void main(String[] args) {
        Homework3 homework3 = new Homework3();
        homework3.test();
    }

}
