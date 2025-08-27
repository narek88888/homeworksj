package homework12;

/*
Exercise 3 (TrafficLight)
Create an enum called TrafficLight with values: RED, YELLOW, GREEN.
Each should have a method getNextLight() returning the next state.



 */


    enum TrafficLight{




        RED{
            public TrafficLight getNextLight(){
                return YELLOW;
            }
        },

        YELLOW{
            public TrafficLight getNextLight(){
                return GREEN;
            }

        },

        GREEN{

            public TrafficLight getNextLight() {
                return RED;
            }
        };






    public abstract TrafficLight getNextLight();
    }


    public class Task3 {

        public static void main(String[] args) {

            TrafficLight currentLight = TrafficLight.RED;

            System.out.println(currentLight);


            currentLight = currentLight.getNextLight();

            System.out.println(currentLight);

            currentLight = currentLight.getNextLight();

            System.out.println(currentLight);

            currentLight = currentLight.getNextLight();

            System.out.println(currentLight);
        }
    }