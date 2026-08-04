class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean [] used = new boolean[nums.length];
        backtrack(nums , new ArrayList<>() , used);
        return list;
   }
    public void backtrack (int nums[] , List<Integer> temp , boolean[] used){
        if(temp.size() == nums.length){
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i =0;i<nums.length;i++){

        if(used[i]) continue;

            temp.add(nums[i]);
            used[i] = true;

            backtrack(nums , temp , used);
            temp.remove(temp.size()-1);
            used[i] = false;
        }
    }
}