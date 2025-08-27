package homework12;

/*
Exercise 7
Create an enum called "CoffeeSize" that contains values for SMALL ,
 MEDIUM, and LARGE coffee sizes. Write a program that prints the
  name and ordinal value of each size.
 */

enum CoffeeSize{
    SMALL("Late", 500),
    MEDIUM("Late", 800),
    LARGE("Late", 1200);

    private int price;
    private String name;
    private CoffeeSize(String name, int price){
        this.price = price;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}



public class Task7 {

    public static void main(String[] args){
        System.out.println(CoffeeSize.LARGE.name() + " " + CoffeeSize.LARGE.getName() + " " + CoffeeSize.LARGE.getPrice() );



        System.out.println(CoffeeSize.SMALL.ordinal());
        System.out.println(CoffeeSize.MEDIUM.ordinal());
        System.out.println(CoffeeSize.LARGE.ordinal());
    }

}