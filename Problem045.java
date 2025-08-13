// Problem 045: Create a class with private properties and public getter/setter.
public class Problem045 {

    private int studentId;
    private String studentName;

    public Problem045(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public static void main(String[] args) {
        Problem045 obj = new Problem045(1, "Rabin Humagain");
        System.out.println("Student id:" + obj.getStudentId());
        System.out.println("Student Name:" + obj.getStudentName());
    }
}