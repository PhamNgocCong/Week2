public class Solution {
    public int sumOfDigits(int n)
    {
        int ketqua=0;
        if(n<0) n=-n;
        while(n>0)
        {
            ketqua=ketqua+n%10;
            n=n/10;
        }
        return ketqua;
    }
}
