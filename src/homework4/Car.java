package Homework4;//7.Սահմանել Car class-ը, որը ունի
//● instance  fields (model, modelNumber , color, currentSpeed (default արժեքը 0),
// isEngineStart (true or false))
//● methods (stopEngine() անջատում է մատոռը , startEngine()  միացնում է մատոռը)
//Ստեղծել Mercedes  C ,203,  սև   և   S , 505 ,սպիտակ  մակնիշի մեքենաներ․


// Homework lesson 4

public class Car{
    String model;
    String modelNumber;
    String color;
    int currentSpeed;
    boolean isEngineStart;

    public void stopEngine(){
        isEngineStart = false;

        System.out.println("Engine stopped");

    }

    public void startEngine(){
        isEngineStart = true ;
        System.out.println("Engine started");

    }

    public static void main(String[] args){
        Car car1 = new Car();
        Car car2 = new Car();

        car1.model = "Mercedes";
        car1.modelNumber = "C 203";
        car1.color = "Black";
        car1.currentSpeed = 0;

        car2.model = "Mercedes";
        car2.modelNumber = "S 505";
        car2.color = "White";
        car2.currentSpeed = 0;

        System.out.println("car1 Model " + car1.model );
        System.out.println("car1 Model Number " + car1.modelNumber );
        System.out.println("car1 color " + car1.color );
        System.out.println("car1 Current Speed " + car1.currentSpeed );

        System.out.println("car2 Model " + car2.model );
        System.out.println("car2 Model Number " + car2.modelNumber );
        System.out.println("car2 color " + car2.color );
        System.out.println("car2 Current Speed " + car2.currentSpeed);

    }
}