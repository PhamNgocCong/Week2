public class Solution{
    public int reverse(int n){
        long ketqua=0;
        while (n!=0) {
            int luu=n%10;
            ketqua=ketqua*10+luu;
            n=n/10;
        }
        if (ketqua > Integer.MAX_VALUE || ketqua < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) ketqua;
    }
}
