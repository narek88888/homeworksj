package homework17;

import java.util.LinkedList;

//Palindrome Check   (e.g., 1 -> 2 -> 2 -> 1).
public class task13 {
    public static Boolean checkPolindrome(LinkedList<Integer> x){
        LinkedList<Integer> reversed = new LinkedList<>();
        for (int i = x.size() - 1; i >= 0 ; i--) {
            reversed.add(x.get(i));
        }
        int j = 0;
        while(j < x.size()){
            if(!x.get(j).equals(reversed.get(j))){
                return false;
            }
            j++;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList<Integer> y = new LinkedList<>();
        y.add(1);
        y.add(2);
        y.add(2);
        y.add(2);
        y.add(1);
        y.add(1);
        LinkedList<Integer> y1 = new LinkedList<>();
        y1.offer(5);
        y1.offer(6);
        y1.offer(7);
        y1.offer(7);
        y1.add(1);
        y1.add(10);
        System.out.println(y1);
    }
}
