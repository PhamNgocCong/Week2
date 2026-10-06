public class Main {
    public static void main(String[] args) {
        NumberWrapper n1 = new NumberWrapper(5);
        NumberWrapper n2 = new NumberWrapper(10);
        System.out.println("Trước khi gọi swap:");
        System.out.println("n1 = " + n1.getValue() + ", n2 = " + n2.getValue());
        Solution.swap(n1, n2);

        System.out.println("\nSau khi gọi swap:");
        System.out.println("n1 = " + n1.getValue() + ", n2 = " + n2.getValue());
    }
}
