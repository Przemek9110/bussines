package pl.sdacademy.podstawy;

import java.time.LocalDate;

public class Employee {

    private final String firstName;
    private final String lastName;
    private final LocalDate birthDay;
    private double salary;

    public Employee(String firstName, String lastName, LocalDate birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return (firstName + " " + lastName);
    }
}
