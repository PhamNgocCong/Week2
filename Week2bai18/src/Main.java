public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] testCases = {121, -121, 10, 0, 12321, 1234567899};

        System.out.println("=== KIỂM TRA SỐ PALINDROME ===");
        for (int n : testCases) {
            boolean check = solution.isPalindrome(n);
            System.out.println("n = " + n + " -> " + (check ? "Là số Palindrome" : "Không phải Palindrome"));
        }
    }
}
