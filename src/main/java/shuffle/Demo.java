package shuffle;

import java.util.Arrays;

/**
 * @author Zbigniew Lemiesz
 */


/*
Given an integer array nums, design an algorithm to randomly shuffle the array.
All permutations of the array should be equally likely as a result of the shuffling.
 */

public class Demo {
    public static void main(String[] args) {
        Solution obj = new Solution(new Integer[]{1, 2, 3});
        Integer[] param_1 = obj.reset();
        System.out.println(Arrays.toString(param_1));
        Integer[] param_2 = obj.shuffle();
        System.out.println(Arrays.toString(param_2));
    }
}
