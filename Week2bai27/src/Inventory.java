public class Inventory {
    private Product[] items;
    public Inventory(Product[] initialItems) {
        this.items=initialItems;
    }

    public void displayInventory() {
        System.out.println("=== DANH SÁCH SẢN PHẨM TRONG KHO ===");
        for (Product item : items) {
            if (item != null) {
                item.printInfo();
            }
        }
    }
}

