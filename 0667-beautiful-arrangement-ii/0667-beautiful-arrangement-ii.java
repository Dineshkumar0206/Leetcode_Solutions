class Solution {
    public int[] constructArray(int n, int k) {
        int[] ans = new int[n];

        int left = 1;
        int right = k + 1;
        int index = 0;

        while (left <= right) {
            ans[index++] = left++;

            if (left <= right) {
                ans[index++] = right--;
            }
        }

        for (int i = k + 2; i <= n; i++) {
            ans[index++] = i;
        }

        return ans;
    }
}