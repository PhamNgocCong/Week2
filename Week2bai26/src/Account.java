import java.util.Arrays;

class Account {
   private String accountID;
   private double balance;
   private Transaction[] history;
   private int size;

   public Account(String accountID,double balance){
       this.accountID=accountID;
       this.balance=balance;
       this.history=new Transaction[10];
       this.size=0;
   }


   public void addTransaction(Transaction t)
   {
       if (t == null) return;
       if(size == history.length) {
           history = Arrays.copyOf(history, history.length * 2);
       }
       history[size++]=t;
   }

   public Transaction[] getHistory() {
       Transaction[] copy = new Transaction[size];
       for(int i=0;i<size;i++) {
           copy[i]=history[i];
       }
       return copy;
   }

    public void displayHistory() {
        System.out.println("=== LỊCH SỬ GIAO DỊCH GỐC TRONG ACCOUNT ===");
        for (int i = 0; i < size; i++) {
            System.out.println(history[i]);
        }
    }
}
