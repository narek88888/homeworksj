package homework10;


//6.Create a class with a static method that accepts two strings and
// returns a string that contains all the characters that appear in
// both strings. Use this method in another class to find the common
// characters in two randomly generated strings.

public class task6 {
    class A{
        public static String doTask(String x, String y) {
            String[] all = {"qwertyuiop[]asdfghjklzxcvbnm,./<>;'zxcvbnm,./1234567890!@#$%^&*()_-+=~"};

            String a = "Davo";

            int i;

            for (i = 0; i < all.length; i++) {
                if (x.contains(all[i]) && y.contains(all[i]) && a.contains((all[i]))) {
                    System.out.println("there is common characters");

                } else {
                    System.out.println("there is not common characters");
                }

            }


            return all[i];
        }


    }



    public static void main(String[] args){
        System.out.println(A.doTask("Gago", "Davo"));

    }



}
