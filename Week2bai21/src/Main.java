public class Main {
    public static void main(String[] args) {
        System.out.println("--- KỊCH BẢN 1: Tạo tài khoản với số dư âm ---");
        BankAccount acc = new BankAccount("ACC101", "Nguyen Van A", -500000);
        System.out.println("Số dư hiện tại: " + acc.getBalance() + " VND\n");

        System.out.println("--- KỊCH BẢN 2: Nạp tiền âm ---");
        acc.deposit(-100000);
        System.out.println("Số dư hiện tại: " + acc.getBalance() + " VND\n");

        System.out.println("--- KỊCH BẢN 3: Nạp tiền hợp lệ ---");
        acc.deposit(1000000);
        System.out.println("Số dư hiện tại: " + acc.getBalance() + " VND\n");

        System.out.println("--- KỊCH BẢN 4: Rút tiền quá số dư ---");
        boolean isSuccess1 = acc.withdraw(2000000);
        System.out.println("Rút tiền thành công: " + isSuccess1 + "\n");

        System.out.println("--- KỊCH BẢN 5: Rút tiền hợp lệ ---");
        boolean isSuccess2 = acc.withdraw(400000);
        System.out.println("Rút tiền thành công: " + isSuccess2);
        System.out.println("Số dư cuối cùng: " + acc.getBalance() + " VND");
    }
}
