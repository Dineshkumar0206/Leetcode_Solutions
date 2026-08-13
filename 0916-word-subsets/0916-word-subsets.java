class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> list = new ArrayList<>();
        int freq[] = new int[26];
        for(String word : words2){
            int count[] = new int[26];
            for(char c : word.toCharArray()){
                count[c-'a']++;
            }
           for(int i =0;i<26;i++){
            freq[i] = Math.max(freq[i] , count[i]);
           }
        }
        for(String word: words1){
            int count[] = new int[26];
            for(char c : word.toCharArray()){
                count[c-'a']++;
            }
            boolean flag = true;
            for(int i =0;i<26;i++){
                if(count[i] < freq[i]) {
                    flag = false;
                    break;
                }
            }
              if(flag) list.add(word);
        }
        return list;
    }
}