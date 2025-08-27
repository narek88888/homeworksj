package homework12;

/*
Exercise 2 (Planet)
Create an enum called Planet with  fields.

mass (double),  radius (double)

Add a constructor.

public enum Planet {
   EARTH(5.97e24, 6371),
   MARS(6.42e23, 3389);
   // fields, constructor, and methods
}

 */




    enum Planet{
        EARTH(5.97e24, 6371),
        MARS(6.42e23, 3389);

       private double mass;
       private double radius;

       private Planet(double mass, double radius){
           this.mass = mass;
           this.radius = radius;


       }

       public double getMass(){
           return mass;
        }

        public double getRadius() {
            return radius;
        }



    }

    public class Task2 {
        public static void main(String[] args) {
            System.out.println(Planet.EARTH.getMass());
            System.out.println(Planet.MARS.getMass());


        }

    }
