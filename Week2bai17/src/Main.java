public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution(); // Tạo đối tượng Solution

        System.out.println(solution.reverse(123));        // Kết quả: 321
        System.out.println(solution.reverse(-123));       // Kết quả: -321
        System.out.println(solution.reverse(120));        // Kết quả: 21
        System.out.println(solution.reverse(1534236469)); // Tràn số -> Kết quả: 0
    }
}
