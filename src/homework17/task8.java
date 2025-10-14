package homework17;

import java.util.ArrayList;

//8.Find the Largest Number
public class task8 {
    public static int findTheLargestNumebr(ArrayList<Integer> x){
        int max = 0;
        for (int i = 0; i < x.size(); i++){
            if(x.get(i) > max){
                max = x.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(500);
        nums1.add(58);
        nums1.add(10000);
        nums1.add(58);
        nums1.add(5000);
        System.out.println(findTheLargestNumebr(nums1));
    }

}
