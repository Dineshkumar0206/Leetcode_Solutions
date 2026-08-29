class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> list = new ArrayList<>();
        int freq[] = new int[101];
        for(int i : bulbs)
        {
           freq[i-0]++;
        }
        for(int i = 0 ; i < freq.length ; i++){
            if(freq[i]%2 != 0){
                list.add(i);
            }
        }
        return list;
    }
}