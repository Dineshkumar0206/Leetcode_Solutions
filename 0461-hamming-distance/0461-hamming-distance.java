class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        for(int i =31 ;i>=0;i--){
            int n = x & 1 << i;
            int m = y & 1 << i;
            if(n!=m) count++;
        }
        return count ;
    }
}