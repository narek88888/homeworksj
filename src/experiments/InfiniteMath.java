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


class Math {
    public final double secret = 2;
} class ComplexMath extends Math {
    public final double secret = 4;
} public class InfiniteMath extends ComplexMath {
    public final double secret = 8;
    public static void main(String[] numbers) {
        Math math = new InfiniteMath();
        System.out.print(math.secret);
    }
}