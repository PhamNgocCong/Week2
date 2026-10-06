public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account("ACC12345", 5000000);
        myAccount.addTransaction(new Transaction("TX01", 100000, "2026-10-06 10:00"));
        myAccount.addTransaction(new Transaction("TX02", 200000, "2026-10-06 11:30"));

        System.out.println("--- Trạng thái ban đầu ---");
        myAccount.displayHistory();
        System.out.println("\n>>> Hacker lấy mảng lịch sử từ getHistory()...");
        Transaction[] hackerHistory = myAccount.getHistory();
        System.out.println(">>> Hacker gán hackerHistory[0] = null");
        hackerHistory[0] = null;
        System.out.println(">>> Hacker ghi đè hackerHistory[1] bằng Transaction giả (9999999)");
        hackerHistory[1] = new Transaction("TX02_FAKE", 9999999, "2026-10-06 11:30");
        System.out.println("\n--- Trạng thái sau khi bị Hacker tấn công ---");
        myAccount.displayHistory();
    }

}
