import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, result);
        return result;
    }

    private void backtrack(int[] nums, int index, List<List<Integer>> result) {
        if (index == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) temp.add(num);
            result.add(temp);
            return;
        }

        for (int i = index; i < nums.length; i++) {
           
            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;

            backtrack(nums, index + 1, result); 

           
            temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }
    }
}
