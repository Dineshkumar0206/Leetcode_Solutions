class Solution {
    public int smallestIndex(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] < 10)
            {
                if(nums[i] == i && min > i)
                {
                    min = i;
                }
            }
            else
            {
                int num = nums[i];
                int sum = 0;
                while(num > 0)
                {
                    sum += num % 10;
                    num /= 10;
                    //num = sum ;
                }

                if(sum == i && min > i)
                {
                    min = i;
                } 
            }
        }
        if(min != Integer.MAX_VALUE) return min;
        return -1;
    }
}