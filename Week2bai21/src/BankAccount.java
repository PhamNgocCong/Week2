public class BankAccount {
    private final String accountNumber;
    private double balance;
    private String ownerName;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        if(balance<0)
        {
            System.out.println("Lỗi : Số dư ban đầu không được âm.");
            this.balance=0;
        }
        else this.balance=balance;

    }

    public BankAccount(String accountNumber, String ownerName)
    {
        this(accountNumber,ownerName,0);
    }


    public void deposit(double amount)
    {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Nạp thành công " + amount + " VND. Số dư mới: " + this.balance + " VND.");
        } else {
            System.out.println("Lỗi: Số tiền nạp phải lớn hơn 0.");
        }
    }


    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Rút thành công " + amount + " VND. Số dư còn lại: " + this.balance + " VND.");
            return true;
        } else {
            System.out.println("Lỗi: Số tiền rút không hợp lệ hoặc vượt quá số dư hiện tại.");
            return false;
        }
    }


    public double getBalance() {
        return balance;
    }

}
