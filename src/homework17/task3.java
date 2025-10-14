package homework17;

//3.Swap two elements in a list.

import java.util.ArrayList;

public class task3 {

    public static ArrayList<Integer> swap(ArrayList<Integer> x, int i, int j){
        Integer saver = x.get(i);
        x.set(i,x.get(j));
        x.set(j,saver);
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


        System.out.println(swap(nums1, 0, 5));

    }
}
