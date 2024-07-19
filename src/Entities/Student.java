package Entities;
import java.util.List;

public class Student extends Person {
    private int studentId;
    private List<Course> coursesTaken;
    
    // Constructors
    public Student() {
        // Default constructor
    }
    
    public Student(String name, String address, String email, int studentId, List<Course> coursesTaken) {
        super(name, address, email); // Call to superclass constructor
        this.studentId = studentId;
        this.coursesTaken = coursesTaken;
    }
    
    // Getters
    public int getStudentId() {
        return studentId;
    }
    
    public List<Course> getCoursesTaken() {
        return coursesTaken;
    }
    
    // Setters
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
    public void setCoursesTaken(List<Course> coursesTaken) {
        this.coursesTaken = coursesTaken;
    }
}
