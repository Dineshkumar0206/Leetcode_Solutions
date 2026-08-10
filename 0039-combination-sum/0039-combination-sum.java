import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        combinationSumHelper(candidates, target, 0, new ArrayList<>(), list);
        return list;
    }
    
    private void combinationSumHelper(int[] candidates, int target, int startIndex, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (target < 0) {
            return;
        }

        for (int i = startIndex; i < candidates.length; i++) {
            current.add(candidates[i]);
            combinationSumHelper(candidates, target - candidates[i], i, current, result);
            current.remove(current.size() - 1);
        }
    }
}