package com.solvd.homework11.models;

import com.solvd.homework11.interfaces.IWork;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Customer extends Person implements IWork {
    private static final Logger LOGGER = LogManager.getLogger(Customer.class);
    private String phoneNumber;
    private int timesVisitingZoo;
    private String work;

    public Customer(String id, int age, String firstName, String lastName,
                    Gender gender, Country country, String phoneNumber,
                    int timesVisitingZoo, String work) {
        super(id, age, firstName, lastName, gender, country);
        this.phoneNumber = phoneNumber;
        this.timesVisitingZoo = timesVisitingZoo;
        this.work = work;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getTimesVisitingZoo() {
        return timesVisitingZoo;
    }

    public void setTimesVisitingZoo(int timesVisitingZoo) {
        this.timesVisitingZoo = timesVisitingZoo;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public void walk() {
        LOGGER.info("I can walk down the streets from the Zoo!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Customer customer = (Customer) o;

        if (timesVisitingZoo != customer.timesVisitingZoo) return false;
        return phoneNumber.equals(customer.phoneNumber);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + phoneNumber.hashCode();
        result = 31 * result + timesVisitingZoo;
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", timesVisitingZoo=" + timesVisitingZoo +
                ", id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", country=" + country +
                '}';
    }

    @Override
    public void work() {
        LOGGER.info("I work as a " + this.work);
    }
}
