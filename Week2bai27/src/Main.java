public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("P01", "Laptop", 1000);
        Product p2 = new Product("P02", "Mouse", 20);
        Product[] arr = { p1, p2 };

        Inventory kho = new Inventory(arr);

        System.out.println("--- Giá sản phẩm trong kho ban đầu ---");
        kho.displayInventory();


        System.out.println("\n>>> Sửa arr[0].setPrice(5000) bên ngoài...");
        arr[0].setPrice(5000);


        System.out.println("\n--- Giá sản phẩm trong kho sau khi sửa mảng bên ngoài ---");
        kho.displayInventory();
    }
}
