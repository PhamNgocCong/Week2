public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Lập trình Java", "Nguyễn Văn A", 150000);
        Book book2 = new Book("Lập trình Java", "Nguyễn Văn A", 150000);


        boolean compareWithOperator = (book1 == book2);
        boolean compareWithEquals = book1.equals(book2);


        System.out.println("So sánh bằng toán tử (book1 == book2): " + compareWithOperator);
        System.out.println("So sánh bằng phương thức (book1.equals(book2)): " + compareWithEquals);
    }
}
