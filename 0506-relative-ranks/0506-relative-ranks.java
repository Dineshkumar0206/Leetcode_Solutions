class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int count[] = score.clone();
        Arrays.sort(count);
        String[] res = new String[n];

        for(int i = 0 ; i < n ; i++)
        {
            int ans = n - Arrays.binarySearch(count , score[i]);

            if(ans == 1)
            {
                res[i] = "Gold Medal";
            }
            else if(ans == 2)
            {
                res[i] = "Silver Medal";
            }
            else if(ans == 3)
            {
                res[i] = "Bronze Medal";
            }
            else
            {
                res[i] = String.valueOf(ans) ;
            }
        }
        return res;
    }
}