package homework17;

import java.util.LinkedList;

//14.Remove Duplicates
public class task14 {
    public static LinkedList<Integer> removeDublicates(LinkedList<Integer> x){
        for (int i = 0; i < x.size(); i++) {
            for (int j = i + 1; j < x.size() - 1; j++) {
                if(x.get(i).equals(x.get(j))){
                    x.remove(j);
                    j--;
                }
            }
        }
        return x;
    }

    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(5);
        nums.add(7);
        nums.add(7);
        nums.add(5);
        nums.add(5);
        nums.add(1);
        nums.add(2);

        System.out.println(removeDublicates(nums));
    }

}
