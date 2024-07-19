package Entities;

import java.util.List;

public class Department {
    private String name;
    private Professor headProfessor;
    private List<Course> coursesOffered;
    
    // Constructors
    public Department() {
        // Default constructor
    }
    
    public Department(String name, Professor headProfessor, List<Course> coursesOffered) {
        this.name = name;
        this.headProfessor = headProfessor;
        this.coursesOffered = coursesOffered;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public Professor getHeadProfessor() {
        return headProfessor;
    }
    
    public List<Course> getCoursesOffered() {
        return coursesOffered;
    }
    
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setHeadProfessor(Professor headProfessor) {
        this.headProfessor = headProfessor;
    }
    
    public void setCoursesOffered(List<Course> coursesOffered) {
        this.coursesOffered = coursesOffered;
    }
}
