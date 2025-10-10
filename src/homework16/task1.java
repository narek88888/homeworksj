package homework16;
//Find the first N Fibonacci numbers  (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, …)

import java.util.Arrays;

public class task1 {
    public static int[] findFirstNFibonacciNumbers(int n){


        int[] nums = new int[n];

            if(n == 1){
            nums[0] = 0;

            return nums;
            }
            else if(n == 2) {
                nums[0] = 0;
                nums[1] = 1;
                return nums;
            }else {
                nums[0] = 0;
                nums[1] = 1;
                nums[2] = 1;
            }

        for (int i = 1; i < n - 2; i++) {
            nums[2 + i] = nums[i] + nums[i + 1];

        }
        return nums;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(findFirstNFibonacciNumbers(10)));
    }

}
