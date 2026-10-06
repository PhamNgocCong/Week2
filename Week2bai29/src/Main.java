import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== NHẬP THÔNG TIN SẢN PHẨM 1 ===");
        System.out.print("Tên sản phẩm: ");
        String name1 = scanner.nextLine();
        System.out.print("Giá bán: ");
        double price1 = scanner.nextDouble();
        System.out.print("Số lượng tồn kho: ");
        int quantity1 = scanner.nextInt();
        System.out.print("Mức giảm giá: ");
        double discount1 = scanner.nextDouble();
        scanner.nextLine(); // Đọc bỏ dòng trống sau khi nhập số

        Product p1 = new Product(name1, price1, quantity1, discount1);

        System.out.println("\n=== NHẬP THÔNG TIN SẢN PHẨM 2 ===");
        System.out.print("Tên sản phẩm: ");
        String name2 = scanner.nextLine();
        System.out.print("Giá bán: ");
        double price2 = scanner.nextDouble();
        System.out.print("Số lượng tồn kho: ");
        int quantity2 = scanner.nextInt();
        System.out.print("Mức giảm giá: ");
        double discount2 = scanner.nextDouble();

        Product p2 = new Product(name2, price2, quantity2, discount2);


        System.out.println("\n=== THỰC HIỆN GIAO DỊCH ===");
        System.out.print("Nhập số lượng cần mua cho " + p1.getName() + ": ");
        int buyAmount1 = scanner.nextInt();
        p1.sell(buyAmount1);

        System.out.print("Nhập số lượng cần mua cho " + p2.getName() + ": ");
        int buyAmount2 = scanner.nextInt();
        p2.sell(buyAmount2);


        try { Thread.sleep(100); } catch (InterruptedException e) {}


        System.out.println("\n=== KIỂM TRA TÍNH CHẤT STATIC ===");


        System.out.println("1. Giá cuối ban đầu (VAT = 10%):");
        System.out.println("   - " + p1.getName() + ": " + p1.calculateFinalPrice());
        System.out.println("   - " + p2.getName() + ": " + p2.calculateFinalPrice());


        System.out.println("\n2. Gọi Product.updateTaxRate(0.08) (Giảm VAT xuống 8%):");
        Product.updateTaxRate(0.08);
        System.out.println("   - " + p1.getName() + ": " + p1.calculateFinalPrice());
        System.out.println("   - " + p2.getName() + ": " + p2.calculateFinalPrice());


        System.out.println("\n3. Gọi p1.updateDiscount(10.0) (Đổi discount của p1 thành 10):");
        p1.updateDiscount(10.0);
        System.out.println("   - " + p1.getName() + ": " + p1.calculateFinalPrice());
        System.out.println("   - " + p2.getName() + ": " + p2.calculateFinalPrice());


        System.out.println("\n=== TỔNG DOANH THU TOÀN HỆ THỐNG ===");
        System.out.println("Total Revenue: " + Product.getTotalRevenue());

        scanner.close();
    }
}
