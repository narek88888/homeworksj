package homework16;
//Given String s. Count chars in a string

public class task3 {
    public static int countCharsOfString(String s){
        int count = 0;
        if(s == null){
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            count++;

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countCharsOfString(null));
        System.out.println(countCharsOfString("Narek"));
    }
}
