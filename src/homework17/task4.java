package homework17;

import java.util.ArrayList;

//4.Iterate and print list elements.
public class task4 {
    public static void Iterate(ArrayList<Integer> x){
        for (Integer i: x){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(5);
        nums1.add(58);
        nums1.add(0);
        nums1.add(58);
        nums1.add(75);

        Iterate(nums1);

    }
}
