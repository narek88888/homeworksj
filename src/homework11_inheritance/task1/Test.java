package homework11_inheritance.task1;

public class Test {
    public static void main(String[] args){
        Parent parent = new Parent();
        Child child = new Child();

        System.out.println(parent.showMessage());
        System.out.println(child.showMessage());
    }
}
