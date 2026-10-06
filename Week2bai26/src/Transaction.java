final class Transaction {
   private final String transactionId;
   private final double amount;
   private final String timestamp;

   public Transaction(String transactionId, double amount, String timestamp){
       this.transactionId=transactionId;
       this.amount=amount;
       this.timestamp=timestamp;
   }
    public void printInfo() {
        System.out.println("Mã GD: " + transactionId + " | Số tiền: " + amount + " | Thời gian: " + timestamp);
    }
}
