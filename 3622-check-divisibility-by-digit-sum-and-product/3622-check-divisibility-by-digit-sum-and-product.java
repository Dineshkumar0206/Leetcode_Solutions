class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int pro = 1;
        int temp = n ;
        while(n!=0)
        {
            int digit = n%10;
            sum+=digit;
            pro*=digit;
            n/=10;
        }
        return temp % (sum + pro) == 0;
    }
}