package homework17;

//6.Remove duplicates.

import java.util.ArrayList;

public class task6 {
    public static ArrayList<Integer> removeDublicates(ArrayList<Integer> x){
        for (int i = 0; i < x.size(); i++) {
            for (int j = i + 1; j < x.size(); j++) {
                if(x.get(i).equals(x.get(j)) ){
                    x.remove(j);
                    j--;

                }
            }
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
        System.out.println(removeDublicates(nums1));
    }
}

