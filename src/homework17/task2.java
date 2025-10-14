package homework17;

import java.util.ArrayList;

//Reverse elements in a list.
public class task2 {

    public static ArrayList<Integer> reverseElements(ArrayList<Integer> x){

        ArrayList<Integer> saver = new ArrayList<>();

        for (int i = x.size() -1; i >= 0; i--) {
            saver.add(x.get(i));
        }
        for (int j = 0; j < x.size(); j++) {
            x.set(j, saver.get(j));
        }
        return x;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(5);
        nums1.add(58);
        nums1.add(0);
        nums1.add(58);
        nums1.add(75);

        System.out.println(nums1);
        System.out.println(reverseElements(nums1));


    }
}
