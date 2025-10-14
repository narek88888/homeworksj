package homework17;

import java.util.ArrayList;

// Define ArrayList of numbers {1 , 5 ,58 , 0, 58, 75 …}
//
//Copy list values  into another.
public class task1 {

    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(5);
        nums1.add(58);
        nums1.add(0);
        nums1.add(58);
        nums1.add(75);
        ArrayList<Integer> nums2 =  new ArrayList<>();
        for (Integer x: nums1){
            nums2.add(x);
        }
        System.out.println(nums1);
        System.out.println(nums2);

    }
}
