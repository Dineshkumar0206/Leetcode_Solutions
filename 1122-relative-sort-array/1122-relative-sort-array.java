class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Map<Integer , Integer> map = new LinkedHashMap<>();
        for(int i = 0 ; i < arr2.length ; i++)
        {
            for(int j = 0 ; j < arr1.length ; j++)
            {
                if(arr2[i] == arr1[j])
                {
                    map.put(j , arr1[j]);
                }
            }
        }
        for(int i = 0 ; i < arr1.length ; i++){
            if(!map.containsKey(i)){
                map.put(i , arr1[i]);
            }
        }
        int nums[] = new int[arr1.length];
        int index = 0 ;
        for(Integer i : map.values())
        {
            nums[index++] = i ;
        }
        return nums;
    }
}