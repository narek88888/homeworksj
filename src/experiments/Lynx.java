package experiments;

import experiments.BigCat;

public class Lynx extends BigCat {
    public String name = "lynx";

    public Lynx() {
        super();
        System.out.println("Lynx");
    }


    public void test() {
        Lynx lynx = new Lynx();
        System.out.println(lynx.name); // lynx

    }

    public static void main(String[] args) {

        new Lynx();


    }
}