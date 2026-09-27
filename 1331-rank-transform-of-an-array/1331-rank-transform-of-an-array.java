class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int nums[] = arr.clone();
        Arrays.sort(nums);
        Map<Integer , Integer> map = new HashMap<>();
        int ind = 1;
        for(int i : nums)
        {
            if(!map.containsKey(i))
            {
                map.put(i , ind);
                ind++;
            }
        }
        int res[] = new int[n];
        for (int i = 0; i < arr.length; i++) 
        {
            res[i] = map.get(arr[i]);
        }
        
        return res;
    }
}