package student;

import course.Course;
import computer.Computer;

public class Student {

    private String firstName, lastName;
    private int yearOfBirth;
    private Course course;
    private Computer computer;

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setYearOfBirth(int newYearOfBirth) {
        this.yearOfBirth = newYearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public Course getCourse() {
        return this.course;
    }

    public Computer getComputer() {
        return this.computer;
    }

    public Student() {
        this("Petar", "Petrovic", 1900);
    }

    public Student(String newFirstName, String newLastName, int newYearOfBirth) {
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.yearOfBirth = newYearOfBirth;
        this.course = new Course();
        this.computer = new Computer();
    }

    public void studentInfo() {
        System.out.println("First name: " + this.firstName);
        System.out.println("Last name: " + this.lastName);
        System.out.println("Year of birth: " + this.yearOfBirth);
    }

}
