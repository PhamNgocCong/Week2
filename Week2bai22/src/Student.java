public class Student {
    private String id;
    private String name;
    private String email;
    private double gpa;

    public Student() {
        this.id = "";
        this.name = "";
        this.email = "";
        this.gpa = 0.0;
    }


    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.email = "";
        this.gpa = 0.0;
    }


    public Student(String id, String name, String email, double gpa) {
        this.id = id;
        this.name = name;
        this.email = email;
        setGpa(gpa);
    }


    public Student(Student other) {
        if (other != null) {
            this.id = other.id;
            this.name = other.name;
            this.email = other.email;
            this.gpa = other.gpa;
        }
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getGpa() {
        return gpa;
    }


    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Lỗi: GPA (" + gpa + ") không hợp lệ! GPA phải nằm trong khoảng [0.0 - 4.0]. Giữ nguyên giá trị cũ: " + this.gpa);
        }
    }


    public void displayInfo() {
        System.out.println("SV [Mã: " + id + ", Tên: " + name + ", Email: " + email + ", GPA: " + gpa + "]");
    }


    public static void main(String[] args) {
        System.out.println("TẠO SINH VIÊN BẰNG CONSTRUCTOR KHÔNG THAM SỐ");
        Student sv1 = new Student();
        sv1.setId("SV001");
        sv1.setName("Nguyen Van A");
        sv1.setEmail("a.nguyen@gmail.com");
        sv1.setGpa(3.5);
        sv1.displayInfo();

        System.out.println("\nTẠO SINH VIÊN BẰNG CONSTRUCTOR (ID, NME)");
        Student sv2 = new Student("SV002", "Tran Thi B");
        sv2.setEmail("b.tran@gmail.com");
        sv2.setGpa(3.8);
        sv2.displayInfo();

        System.out.println("\nTẠO SINH VIÊN BẰNG COPY CONSTRUCTOR");
        Student sv3 = new Student(sv1); // Sao chép từ sv1
        sv3.displayInfo();

        System.out.println("\n4. THỬ GÁN GPA KHIẾN LỖI (GPA < 0)");
        System.out.print("Thử gán GPA = -1.5 cho sv1: ");
        sv1.setGpa(-1.5); // Sẽ in thông báo lỗi và giữ nguyên giá trị GPA cũ là 3.5

        System.out.print("Thử gán GPA = 5.0 cho sv2: ");
        sv2.setGpa(5.0); // Thử nghiệm thêm trường hợp > 4.0

        System.out.println("\nTHÔNG TIN SAU KHI GÁN GPA LỖI");
        sv1.displayInfo();
        sv2.displayInfo();
    }
}
