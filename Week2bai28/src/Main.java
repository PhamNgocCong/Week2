public class Main {
    public static void main(String[] args) {
        Person p = new Person("An");
        p.setMe(p);
        System.out.println("Tên: " + p.getMe().getName());
        p = null;
    }
}
