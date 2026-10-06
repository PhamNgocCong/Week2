public class Main {
    public static void main(String[] args) {
        int[] testNumbers = {-5, 0, 1, 2, 3, 4, 16, 17, 29, 100};

        System.out.println("--- KIỂM TRA SỐ NGUYÊN TỐ ---");
        for (int num : testNumbers) {
            boolean result = Solution.isPrime(num);
            if (result) {
                System.out.println(num + " là số nguyên tố.");
            } else {
                System.out.println(num + " KHÔNG PHẢI là số nguyên tố.");
            }
        }
    }
}
