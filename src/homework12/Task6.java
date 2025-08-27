package homework12;

/*
Exercise 6
Create an interface Drawable with a method draw().
Create an enum Shape that implements Drawable, with values CIRCLE, SQUARE, TRIANGLE.


*/

     interface Drawable{
        public abstract void draw();
    }

    enum Shape implements Drawable {
       CIRCLE{

           public void draw() {

           }
       },

       SQUARE{

           public void draw() {

           }
       },

       TRIANGLE{

           public void draw() {

           }
       }

    }




















