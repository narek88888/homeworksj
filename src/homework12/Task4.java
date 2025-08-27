package homework12;

/*
Exercise 4 (Operation)
Create an enum Operation for a calculator: ADD, SUBTRACT, MULTIPLY, DIVIDE.
Each should implement an abstract method apply(a, b) returning the result.

 */


    enum Operation{

        ADD{
            public Integer apply(int a, int b){
                return  a + b;
            }
        },

        SUBTRACT{
            public Integer apply(int a, int b){
                return  a - b;
            }
        },

        MULTIPLY{
            public Integer apply(int a, int b){
                return  a * b;
            }
        },

        DIVIDE{
            public Double apply(int a, int b){
                return Double.valueOf(a / b);
            }
        };



        public abstract Number apply(int a, int b);
    }





public class Task4 {
    public static void main(String[] args) {
        System.out.println(Operation.ADD.apply(15, 15));
        System.out.println(Operation.SUBTRACT.apply(15, 15));
        System.out.println(Operation.MULTIPLY.apply(15, 15));
        System.out.println(Operation.DIVIDE.apply(25, 5));
    }
}

