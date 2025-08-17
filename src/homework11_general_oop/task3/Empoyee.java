package homework11_general_oop.task3;

/*
3.Create a class Employee with:

Multiple constructors: one with name and salary, one with only name.
Use this() to chain constructors.


Create objects using different constructors and print their info.
 */

public class Empoyee {
    String name;
    int salary;

    public Empoyee(String name, int salary){
        this.name = name;
        this.salary = salary;

        System.out.println(name + " " + salary);
    }

    public Empoyee(String name){
        this("Arman", 500000);
        this.name = name;

        System.out.println(name);
    }


    public static void main(String[] args){
        Empoyee empoyee2 = new Empoyee("John");
    }

}

