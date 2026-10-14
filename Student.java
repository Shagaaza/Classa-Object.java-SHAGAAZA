public class Student {
    private String studentId;
    private String studentName;

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void displayStudentDetails() {
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + studentName);
    }

    public String getStudentName() {
        return studentName;
    }
}
