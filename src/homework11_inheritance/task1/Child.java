package homework11_inheritance.task1;

/*
1.Create a class Parent which includes the method
showMessage() print “Hello Parent class ”.
Create a class Child which inherits from Parent and override
showMessage() print “Hello Child class”.
 */

public class Child extends Parent {
    public String showMessage(){
        return "Hello Child class";
    }
}
