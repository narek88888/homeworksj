package homework17;

import java.util.ArrayList;

//7.Find Common elements.
public class task7 {
    public static ArrayList<Integer> findCommonElements(ArrayList<Integer> x, ArrayList<Integer> y) {

        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < x.size(); i++) {
            for (int j = 0; j < y.size(); j++) {
                if (x.get(i).equals(y.get(j)) && !temp.contains(x.get(i))) {
                    temp.add(x.get(i));

                }
            }
        }

        return temp;
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
        nums2.add(2);
        nums2.add(0);
        nums2.add(58);
        nums2.add(0);
        nums2.add(58);
        nums2.add(74);

        System.out.println(findCommonElements(nums1, nums2));
    }
}
