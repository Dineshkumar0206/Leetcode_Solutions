class Solution {
    public int eraseOverlapIntervals(int[][] intervals)
     {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int count = 0;
        int ps = intervals[0][1];
        for(int i = 1; i < intervals.length ;i++ )
        {
            int cs = intervals[i][0];
            if(cs < ps )
            {
                count++;
            }
            else
            {
                ps = intervals[i][1];
            }
        }
        return count ;
    }
}