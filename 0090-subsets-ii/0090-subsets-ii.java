class Solution {
       List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(0 , nums ,new ArrayList<>());
        return res ; 
    }
    public void backtrack(int ind , int nums[] , List<Integer> set){

         res.add(new ArrayList<>(set));

       for(int i =ind;i<nums.length;i++){
        if(i>ind && nums[i] == nums[i-1]){
            continue;
        }
        set.add(nums[i]);
        backtrack(i+1 , nums , set);
        set.remove(set.size()-1);
       }
    }
}