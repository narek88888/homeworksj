package homework17;
//5.Sort list elements.

import java.util.ArrayList;

public class task5 {

    public static ArrayList<Integer> sort(ArrayList<Integer> x) {
        for (int i = 0; i < x.size(); i++) {
            for (int j = 0; j < x.size() - i - 1; j++) {
                if (x.get(j) > x.get(j + 1)) {
                    Integer saver = x.get(j + 1);
                    x.set(j + 1, x.get(j));
                    x.set(j, saver);
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
        System.out.println(sort(nums1));
    }
}
