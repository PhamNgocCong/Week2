public class Product {
    private String name;
    private double price;
    private int quantity;
    private double discount;


    private static double taxRate = 0.1;
    private static double totalRevenue = 0.0;


    public Product(String name, double price, int quantity, double discount) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }


    public static void updateTaxRate(double newRate) {
        taxRate = newRate;
    }

    public static double getTotalRevenue() {
        return totalRevenue;
    }


    public double calculateFinalPrice() {
        return (this.price - this.discount) * (1 + taxRate);
    }

    public void updateDiscount(double newDiscount) {
        this.discount = newDiscount;
    }

    public void sell(int amount) {
        if (amount <= this.quantity) {
            this.quantity -= amount;
            double revenue = amount * calculateFinalPrice();
            totalRevenue += revenue;
            System.out.println("Đã bán thành công " + amount + " sản phẩm " + this.name + "!");
        } else {
            // In thông báo lỗi ra System.err
            System.err.println("Lỗi: Không đủ hàng trong kho cho sản phẩm " + this.name + "!");
        }
    }

    public String getName() {
        return name;
    }
}
