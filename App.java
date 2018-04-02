public class App {
    public static void main(String[] args) {
        Student student = new Student("Nguyen Van A", "Ha Noi", "College", 2018, 47);
        System.out.println(student.toString());

        Staff staff = new Staff("Nguyen Van B", "Ha Noi", "CodeGym", 10);
        System.out.println(staff.toString());
    }
}
