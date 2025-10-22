package experiments;
/*
public class BigCat {
    public String name = "cat";
    protected boolean hasFur = true;
    boolean hasPaws = true;
    private int id;

    public BigCat() {
        System.out.println("BigCat");
    }


    public void print() {
        System.out.println("BigCat");
    }


}

 */

/*
interface Run {
    default void walk() {
        System.out.print("Walking and running!");
    }
} interface Jog {
    default void walk() {
        System.out.print("Walking and jogging!");
    }
}
public class Sprint implements Run, Jog {
    public void walk() {
        System.out.print("Sprinting!");
    }
    public static void main() {
        new Sprint().walk();
    }
}

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class Main {
    public static <T>  void test(T t) {
        System.out.println("Preparing " + t);
    }

    public static void main(String[] args) {

        test("Hello World"); // Preparing Hello World

        test(7); // Preparing 7
    }
}





