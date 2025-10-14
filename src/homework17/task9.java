package homework17;
//Combine Two lists

import java.util.ArrayList;

public class task9 {
    public static ArrayList<Integer> combineTwoLists(ArrayList<Integer> x, ArrayList<Integer> y){
         ArrayList<Integer> combinedList = new ArrayList<>();
        for (Integer i: x){
            combinedList.add(i);
        }
        for (Integer j: y){
            combinedList.add(j);
        }

return combinedList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(5);
        nums1.add(58);
        nums1.add(0);
        nums1.add(58);
        nums1.add(75);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(1);
        nums2.add(20);
        nums2.add(58);
        nums2.add(60);
        nums2.add(72);
        nums2.add(100);
        System.out.println(combineTwoLists(nums1, nums2));
    }
}
