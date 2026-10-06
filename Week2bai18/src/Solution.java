public class Solution {
    public boolean isPalindrome(int n) {
        if(n<0) return false;
        int ketqua = 0,nphu=n;
        while (n != 0) {
            int luu = n % 10;
            ketqua = ketqua * 10 + luu;
            n = n / 10;
        }
        if (ketqua==nphu) return true;
        else return false;


    }
}
