public class Main {
    public static void main(String[] args) {
    Solution sol = new Solution();
    int[] testCases={12345,-987,0,7,-502};
    for(int n:testCases) {
        System.out.println("Tổng các chữ số của " + n + " là: " + sol.sumOfDigits(n));
    }
    }
}
