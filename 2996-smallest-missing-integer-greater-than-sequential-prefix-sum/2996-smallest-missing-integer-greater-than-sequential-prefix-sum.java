class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
      for(int i = 1 ; i  < nums.length  ; i++)
      {
        if(nums[i] == nums[i-1] +1)
        {
            sum += nums[i] ;
        }
       else
       {
        break;
       }
      }
      boolean existsInArray = true;
        while (existsInArray) {
            existsInArray = false;
            for (int num : nums) {
                if (num == sum) {
                    existsInArray = true;
                    sum++;
                    break; 
                }
            }
        }
      return sum ;
    }
}