class Solution 
{
    public int splitArray(int[] nums, int k)
     {  
        int left = 0;
        int right = 0;
        for(int i = 0 ; i<nums.length;i++)
        {
            left = Math.max(left , nums[i]);
            right+=nums[i];
        }
        int res = right;
        while(left < right )
        {
            int mid = left+(right - left) / 2;
            int sum = 0;
            int count =1;
            for(int i = 0; i < nums.length ;i++)
            {
                if(sum+nums[i] > mid)
                {
                    count++;
                    sum = nums[i];
                }
                else
                {
                    sum+=nums[i];
                }
            }
            if(count <= k)
            {
                right = mid ; 
            }
            else
            {
                left = mid + 1;
            }
        }
        return left;
    }
}