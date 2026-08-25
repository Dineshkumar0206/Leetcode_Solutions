class Solution {
    public int maximumNumberOfStringPairs(String[] words) 
    {
        Set<String> set = new HashSet<>();
        int count = 0 ;
        for(String s : words)
        {
          StringBuilder sb = new StringBuilder(s);
          if(set.contains(sb.reverse().toString()))
          {
            count++;
          }
          set.add(s);
        }
     
      return count;  
    }
}