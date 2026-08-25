class Solution {
    public List<List<Integer>> groupThePeople(int[] group)
     {
        int length = group.length;
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0 ;i < length ; i++)
        {
            if(group[i] > 0)
            {
                int size = group[i];
                List<Integer> temp = new ArrayList<>();
                for(int j = 0 ; j < length && temp.size() < size ; j++)
                {   
                    if(group[j] == size)
                    {
                    temp.add(j);
                    group[j] = 0;
                    }
                }
                 list.add(temp);
            }
        }
        return list;
    }
}