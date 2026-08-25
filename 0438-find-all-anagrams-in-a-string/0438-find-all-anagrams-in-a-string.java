class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int freq [] = new int[128];
        int left =0;
        int right = 0;
        int count =0 ;
        int m = s.length ();
        int n = p.length ();
        
        for(char c : p.toCharArray()){
            freq[c]++;
        }
        
        while(right < m){
            if(freq[s.charAt(right)]>0)  count++;
            freq[s.charAt(right)]--;
            if(right-left+1 == n ){
                if(count == n) list.add(left);
                freq[s.charAt(left)]++;
                if(freq[s.charAt(left)] >0)  count--;
                left++;
            }
            right++;
        }
        return list; 
    }
}