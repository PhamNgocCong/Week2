public class Main {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(1, 1, 2000);
        Employee emp1 = new Employee("Nguyen Van A", date1);
        Employee emp2 = new Employee(emp1);
        emp1.getBirthday().setDate(2, 2, 2022);
        MyDate b1 = emp1.getBirthday();
        MyDate b2 = emp2.getBirthday();
        System.out.println("Emp1 Birthday: " + b1.getDay() + "/" + b1.getMonth() + "/" + b1.getYear());
        System.out.println("Emp2 Birthday: " + b2.getDay() + "/" + b2.getMonth() + "/" + b2.getYear()); }
}
