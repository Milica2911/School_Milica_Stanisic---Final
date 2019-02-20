package main;

import student.Student;

public class Main {

    public static void main(String[] args) {
        Student pera = new Student();
        pera.getCourse().setName("PHP");
        pera.getCourse().setNumberOfClasses(40);
        pera.getComputer().setHardDrive(200);
        pera.getComputer().setMemory(10.0f);
        pera.getComputer().setProcessTact(3.0f);
        pera.studentInfo();

        Student milica = new Student("Milica", "Stanisic", 1991);
        milica.getCourse().setName("Software QA");
        milica.getCourse().setNumberOfClasses(32);
        milica.getComputer().setHardDrive(500);
        milica.getComputer().setMemory(16.0f);
        milica.getComputer().setProcessTact(2.4f);
        milica.studentInfo();
    }

}
