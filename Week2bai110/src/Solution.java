public class Solution {
    public int secondLargest(int[] arr)
    {
        int max1=Integer.MIN_VALUE,max2=-Integer.MIN_VALUE;
        for(int i:arr)
        {
            if(i>max1)
            {
                max2=max1;
                max1=i;
            }
            else if(i>max2 && i<max1)
            max2=i;
        }
        return (max2 == Integer.MIN_VALUE) ? -1:max2;
    }
}
