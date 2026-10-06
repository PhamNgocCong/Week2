public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] testCases = {
                {12, 35, 1, 10, 34, 1},
                {10, 5, 10},
                {10, 10, 10},
                {10},
                {-10, -20, -5, -1}
        };

        for (int i = 0; i < testCases.length; i++) {
            int res = sol.secondLargest(testCases[i]);
            System.out.println("Test case " + (i + 1) + ": " + res);
        }
    }
}
