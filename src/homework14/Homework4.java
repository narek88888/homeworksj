package homework14;

/*
4.Write a program to create an anonymous inner class that implements
 a specific interface and use it to perform an action.

 */



public class Homework4 {
    abstract interface Anonymous {
        public abstract void test();
    }


    void test2(){

    Anonymous anonymous = new Anonymous() {
        @Override
        public void test() {
            System.out.println("Java is object oriented programming language ");

        }
    };
    anonymous.test();

}


    public static void main(String[] args) {
        Homework4 homework4 = new Homework4();
        homework4.test2();
    }
}
