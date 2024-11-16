package shuffle;

import java.util.*;

import static java.util.Collections.*;


/**
 * @author Zbigniew Lemiesz
 */

public class Solution {
    private Integer[] numbers;
    private Integer[] original;
    private final Random random = new Random();

    public Solution(Integer[] nums) {
        this.numbers = nums;
        this.original = nums.clone();
    }

    public Integer[] reset() {
        numbers = original;
        original = original.clone();
        return numbers;
    }

    public Integer[] shuffle() {

        List<Integer> list = new ArrayList<Integer>();
        addAll(list, numbers.clone());

        for (int i = 0; i < numbers.length; i++) {
            int next = random.nextInt(list.size());
            numbers[i] = list.get(next);
            list.remove(next);
        }
        return numbers;
    }
}
