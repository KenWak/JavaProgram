package Entities;

import java.util.List;

public class Professor extends Person {
    private Department department;
    private List<Course> coursesTaught;
    
    // Constructors
    public Professor() {
        // Default constructor
    }
    
    public Professor(String name, String address, String email, Department department, List<Course> coursesTaught) {
        super(name, address, email); // Call to superclass constructor
        this.department = department;
        this.coursesTaught = coursesTaught;
    }
    
    // Getters
    public Department getDepartment() {
        return department;
    }
    
    public List<Course> getCoursesTaught() {
        return coursesTaught;
    }
    
    // Setters
    public void setDepartment(Department department) {
        this.department = department;
    }
    
    public void setCoursesTaught(List<Course> coursesTaught) {
        this.coursesTaught = coursesTaught;
    }
}
