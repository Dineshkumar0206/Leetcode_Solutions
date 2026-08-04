import java.util.ArrayList;
import java.util.List;

class Solution {
    int count = 0;
    String result = "";

    public String getPermutation(int n, int k) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        
        boolean[] used = new boolean[nums.length];
        backtrack(nums, new ArrayList<>(), used, k);
        return result;
    }

    public void backtrack(int[] nums, List<Integer> temp, boolean[] used, int k) {
        if (temp.size() == nums.length) {
            count++;
            if (count == k) {
                StringBuilder sb = new StringBuilder();
                for (int num : temp) {
                    sb.append(num);
                }
                result = sb.toString();
            }
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            if (!result.isEmpty()) return;
            
            temp.add(nums[i]);
            used[i] = true;
            
            backtrack(nums, temp, used, k);
            
            temp.remove(temp.size() - 1);
            used[i] = false;
        }
    }
}