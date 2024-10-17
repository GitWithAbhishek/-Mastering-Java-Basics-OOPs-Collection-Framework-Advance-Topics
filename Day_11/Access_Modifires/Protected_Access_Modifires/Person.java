package mypackage;

public class Person {
    protected String name;  
    protected int age;      
    protected Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
