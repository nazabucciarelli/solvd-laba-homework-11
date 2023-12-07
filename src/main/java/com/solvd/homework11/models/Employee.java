package com.solvd.homework11.models;

import com.solvd.homework11.exceptions.*;
import com.solvd.homework11.interfaces.IWork;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Employee extends Person implements IWork {
    private static final Logger LOGGER = LogManager.getLogger(Employee.class);
    private int entryYear;
    private double salary;

    public Employee(String id, int age, String firstName, String lastName,
                    Gender gender, Country country, int entryYear,
                    double salary) {
        super(id, age, firstName, lastName, gender, country);
        this.entryYear = entryYear;
        this.salary = salary;
    }

    public int getEntryYear() {
        return entryYear;
    }

    public void setEntryYear(int entryYear) {
        if ((this.age - (2023 - entryYear)) < 18) {
            throw new ImpossibleEntryYearException("The employee was under" +
                                                    "18 that year");
        }
        this.entryYear = entryYear;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (this.salary < 1500 || this.salary > 4500) {
            throw new NotAllowedSalaryException("Salary values must be " +
                                                "between 1500 and 4500 USD");
        }
        this.salary = salary;
    }

    @Override
    public void walk() {
        LOGGER.info("I can walk down the streets from the Zoo and "
                            +  "also enter to only-employees rooms.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Employee employee = (Employee) o;

        if (entryYear != employee.entryYear) return false;
        return Double.compare(salary, employee.salary) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + entryYear;
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "entryYear=" + entryYear +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", country=" + country +
                '}';
    }

    @Override
    public void work() {
        LOGGER.info("I am an employee from the zoo!");
    }
}
