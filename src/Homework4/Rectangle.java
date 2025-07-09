package Homework4;//5․ Սահմանել Rectangle class : instance  fields (int length, int width )  , methods ( calculateArea() ) .
//Ստեղծել  ուղղանկյուն (բարձրություն 5,  լայնություն 14)  և հաշվել  ուղղանկյան մակերեսը ։

// Homework lesson 4

public class Rectangle{
    int length ;
    int width ;

    public static void calculateArea(int length1, int width1) {
        System.out.println(length1 * width1);

    }

    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();

        rectangle.length = 5;
        rectangle.width = 14;

        calculateArea(rectangle.length, rectangle.width);


    }

}