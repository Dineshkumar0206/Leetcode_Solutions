class Solution
 {
    public int stoneGameVIII(int[] stones)
    {
        int n = stones.length;
        int pref[] = new int[stones.length];
        pref[0] = stones[0];
        for(int i = 1 ; i  < stones.length ;i++)
        {
            pref[i] = pref[i-1]+stones[i];
        }
        int res = pref[n - 1];
        for (int i = n - 2; i >= 1; i--) 
        {
            res = Math.max(res, pref[i] - res);
        }
        
        return res;
    }
}