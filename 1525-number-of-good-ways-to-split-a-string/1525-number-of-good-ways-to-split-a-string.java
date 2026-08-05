class Solution {
    public int numSplits(String s) {
        int left [] = new int[26];
        int right[] = new int[26];
        int res = 0;
        int n = s.length();
        for(int i =0;i<s.length();i++){
            right[s.charAt(i) - 'a']++;
        }
           int leftDistinct = 0;
        int rightDistinct = 0;
        
        for (int j = 0; j < 26; j++) {
            if (right[j] > 0) rightDistinct++;
        }
        
        for (int i = 0; i < n - 1; i++) {
            char curr = s.charAt(i);
            int idx = curr - 'a';
            
            if (left[idx] == 0) leftDistinct++;
            left[idx]++;
            
            right[idx]--;
            if (right[idx] == 0) rightDistinct--;
            
            if (leftDistinct == rightDistinct) {
                res++;
            }
        }
         return res ;
    }
}
