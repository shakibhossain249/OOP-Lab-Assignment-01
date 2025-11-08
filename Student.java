public class Student {
    int studentId;
    String studentName;
    String grade;

    // Default constructor
    Student() {
        this(0, "Unknown", "N/A");
    }

    // Parameterized constructor
    Student(int studentId, String studentName, String grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101, "Alice", "A");

        System.out.println("Student 1: " + s1.studentId + ", " + s1.studentName + ", " + s1.grade);
        System.out.println("Student 2: " + s2.studentId + ", " + s2.studentName + ", " + s2.grade);
    }
}
