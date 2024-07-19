import java.util.ArrayList;
import java.util.List;

import Entities.Course;
import Entities.Department; 
import Entities.Professor;
import Entities.Student;

public class App {
    public static void main(String[] args) throws Exception {
         // Create a Professor
         Professor professor = new Professor("Dr. Sarah Brown", "789 Elm St", "sarah.brown@example.com", null, null);
        
         // Create some Students
         Student student1 = new Student("John Doe", "123 Main St", "john.doe@example.com", 1001, null);
         Student student2 = new Student("Bob Johnson", "789 Oak St", "bob@example.com", 1002, null);
         
         // Create a Course and enroll students
         List<Student> studentsEnrolled = new ArrayList<>();
         studentsEnrolled.add(student1);
         studentsEnrolled.add(student2);
         
         Course course = new Course("CS101", "Introduction to Computer Science", professor, studentsEnrolled);
         course.setStudentsEnrolled(studentsEnrolled);
         
         // Creating a list of courses offered by the department
        List<Course> coursesOffered = new ArrayList<>();
        coursesOffered.add(new Course("CS101", "Introduction to Computer Science", null, null));
        coursesOffered.add(new Course("CS202", "Data Structures", null, null));
        
        // Creating an instance of Department using the constructor

         // Create a Department
         Department department = new Department("Computer Science", professor, coursesOffered);
         
         // Output information
         System.out.println("Professor: " + professor.getName());
         System.out.println("Department: " + department.getName());
         System.out.println("Students enrolled in " + course.getTitle() + ":");
         for (Student student : course.getStudentsEnrolled()) {
             System.out.println("- " + student.getName());
         }

    }
}
