package Entities;

public class Person {
    private String name;
    private String address;
    private String email;
    
    // Constructors
    public Person() {
        // Default constructor
    }
    
    public Person(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getEmail() {
        return email;
    }
    
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}
