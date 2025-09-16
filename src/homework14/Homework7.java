package homework14;

/*
Write a program to create a member inner class that accesses a private field of the main class.

 */

public class Homework7 {
    private String name = "John";

    class Man{
        void test(){
            System.out.println(name);
        }

    }

    public static void main(String[] args) {
        Homework7 homework7 = new Homework7();
        Homework7.Man x = homework7.new Man();
        x.test();
    }
}
