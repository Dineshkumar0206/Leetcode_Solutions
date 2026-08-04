class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(0 , nums , new ArrayList<>());
        return res;
    }
    public void backtrack(int ind , int  nums[] , List<Integer> temp){
        if(ind == nums.length){
            res.add(new ArrayList<>(temp)) ;
            return ; 
        }
        temp.add(nums[ind]);
        backtrack(ind+1 , nums , temp);
        temp.remove(temp.size()-1);
        backtrack(ind+1 , nums , temp);
    }
} 