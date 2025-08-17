package homework11_inheritance.task3;

/*
 Create a class of Car class which has the following

fields:
passengerCount //  it could not be less than 2
engineType // expected values one letter (‘a-z , A-Z’)

methods: getter & setter of passengerCount & engineType fields

 Create a subclass of Truck class which has the following

fields:
capacity // default value should be 0

methods: getter & setter of capacity field


Use super(...) method in the constructor for initializing the fields of the superclass.
 */

public class Car {

   private int passengerCount;
   private char engineType;

   public Car(int passengerCount, char engineType){
       this.passengerCount = passengerCount;
       this.engineType = engineType;
   }



   public int getPassengerCount(){
       return passengerCount;
   }

   public void setPassengerCount(int passengerCount) {
       if (passengerCount >= 2) {
           this.passengerCount = passengerCount;
       }
       else {
           System.out.println("minimum must be 2");
       }
   }


       public char getEngineType() {
           return engineType;
       }


       public void setEngineType(char engineType){
       String x = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";

           for (int i = 0; i < x.length(); i++) {
               if(engineType == x.charAt(i)){
                   this.engineType = engineType;
               }
               else{
                   System.out.println("given engine type name is wrong, give one letter");
               }
           }



       }

       public static void main(String[] args){
       Truck truck = new Truck(100);
           System.out.println(truck.getCapacity());
           System.out.println(truck.getPassengerCount());
           System.out.println(truck.getEngineType());

           truck.setCapacity(-10);
           truck.setCapacity(500);
           System.out.println(truck.getCapacity());


           truck.setEngineType('2');
           truck.setEngineType('L');
           System.out.println(truck.getEngineType());

           truck.setPassengerCount(-5);
           System.out.println(truck.getPassengerCount());

           truck.setPassengerCount(7);
           System.out.println(truck.getPassengerCount());





       }


}

class Truck extends Car{

    private int capacity;

    public Truck(int capacity){
        super(4, 'V');
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setCapacity(int capacity){
        if(capacity >= 0){
            this.capacity = capacity;

        }
        else {
            System.out.println("given capacity less than 0, minimum can be 0");
        }
    }




}











