public class Solution
{
    public IList<int> AddToArrayForm(int[] num, int k)
    {
        List<int> list = new List<int>();

        int i = num.Length - 1;

        while (i >= 0 || k > 0)
        {
            if (i >= 0)
            {
                k = k + num[i];
                i--;
            }

            list.Add(k % 10);
            k = k / 10;
        }

        list.Reverse();

        return list;
    }
}