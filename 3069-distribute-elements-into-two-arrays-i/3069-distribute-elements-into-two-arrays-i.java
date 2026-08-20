class Solution 
{
    public int[] resultArray(int[] nums) 
    {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        int res[] = new int[nums.length];
        list.add(nums[0]);
        list1.add(nums[1]);
        for(int i =2;i<nums.length;i++){
            if(list.get(list.size()-1) >list1.get(list1.size()-1)){
                list.add(nums[i]);
            }else{
                list1.add(nums[i]);
            }
        }
        int ind = 0;
         for(int i =0;i<list.size();i++){
              res[ind] = list.get(i);
              ind++;
         }
          for(int i =0;i<list1.size();i++){
              res[ind] = list1.get(i);
              ind++;
         }
         return res;
    }
}