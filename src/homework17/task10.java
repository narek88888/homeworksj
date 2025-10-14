package homework17;

import java.util.ArrayList;

//10.Find the Second-Largest Element
public class task10 {
    public static Integer findTheSecondLargest(ArrayList<Integer> x){
        Integer max = 0;
        Integer maxIndex = -1;
        int secondLargest = 0;
        for (int i = 0; i < x.size(); i++) {
            if(x.get(i) > max){
                max = x.get(i);
                maxIndex = i;
            }
        }
        for (int j = 0; j < x.size() ; j++) {
            if(x.get(j).equals(max)){
                x.remove(x.get(j));
                j--;
            }
        }


        for (int k = 0; k < x.size(); k++) {
            if(x.get(k) > secondLargest ){
                secondLargest = x.get(k);
            }
        }
        x.add(maxIndex, max);
        return secondLargest;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(5);
        nums1.add(58);
        nums1.add(0);
        nums1.add(58);
        nums1.add(58);
        nums1.add(58);
        nums1.add(58);
        nums1.add(75);
        nums1.add(75);
        nums1.add(75);
        nums1.add(75);

        System.out.println(findTheSecondLargest(nums1));

    }

}
