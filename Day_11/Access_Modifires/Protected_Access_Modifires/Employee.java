package mypackage;

public class Employee extends Person {
    private String designation;

    public Employee(String name, int age, String designation) {
        super(name, age);  
        this.designation = designation;
    }

    public void showEmployeeDetails() {
        displayDetails();  
        System.out.println("Designation: " + designation);
    }
}
