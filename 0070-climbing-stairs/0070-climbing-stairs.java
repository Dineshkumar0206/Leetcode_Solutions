class Solution {
    public int climbStairs(int n) {
         if(n<=2) return n ;
         int m = 2;
         int k = 1;
         int curr = 0;
         for(int i = 3;i<=n;i++){
            curr = m + k ;
            k = m ;
            m = curr;
         }
         return m ;
    }
}