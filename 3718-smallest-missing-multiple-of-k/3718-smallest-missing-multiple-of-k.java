class Solution 
{
    public int missingMultiple(int[] nums, int k) 
    {
        Arrays.sort(nums);
        int n = k ;
        while(true)
        {
           boolean found = false ; 
           for(int i : nums)
           {
            if(i == n )
            {
                found = true ; 
                break ;
            }
           }
           if(!found)
           {
            return n ; 
           }
           n+=k; 
        } 
    }
}