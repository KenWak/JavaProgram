package Entities;

import java.util.List;

public class Course {
    private String courseCode;
    private String title;
    private Professor professor;
    private List<Student> studentsEnrolled;
    
    // Constructors
    public Course() {
        // Default constructor
    }
    
    public Course(String courseCode, String title, Professor professor, List<Student> studentsEnrolled) {
        this.courseCode = courseCode;
        this.title = title;
        this.professor = professor;
        this.studentsEnrolled = studentsEnrolled;
    }
    
    // Getters
    public String getCourseCode() {
        return courseCode;
    }
    
    public String getTitle() {
        return title;
    }
    
    public Professor getProfessor() {
        return professor;
    }
    
    public List<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }
    
    // Setters
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public void setStudentsEnrolled(List<Student> studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }
}

