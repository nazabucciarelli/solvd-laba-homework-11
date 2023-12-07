package com.solvd.homework11.models;

import com.solvd.homework11.exceptions.EmptyFieldException;
import com.solvd.homework11.exceptions.IdLengthException;
import com.solvd.homework11.exceptions.NegativeValueException;
import com.solvd.homework11.interfaces.IBreath;
import com.solvd.homework11.interfaces.IEat;
import com.solvd.homework11.interfaces.ISleep;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Person implements ISleep, IEat, IBreath {
    private static final Logger LOGGER = LogManager.getLogger(Person.class);
    protected String id; // Using protected access modifier.
    protected int age;
    protected String firstName;
    protected String lastName;
    protected Gender gender;
    protected Country country;

    public Person(String id,int age, String firstName, String lastName,
                  Gender gender, Country country) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.length() != 9){
            throw new IdLengthException("ID length must be exactly 9" +
                                        " characters");
        }
        this.id = id;
    }

    public int getAge() {
        return age;
    }
    // First way of handling an exception, using the 'throws' keyword
    public void setAge(int age) throws NegativeValueException {
        if (age < 0) {
            throw new NegativeValueException("Age cannot be negative");
        }
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.isBlank()) {
            throw new EmptyFieldException("Field first name cannot be empty");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.isBlank()) {
            throw new EmptyFieldException("Field last name cannot be empty");
        }
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    abstract public void walk(); // Defining an abstract method

    public final void sleep() { // Using final methods
        LOGGER.info("I sleep in a bed, during the night!");
    };

    public final void eat() {
        LOGGER.info("I can eat meats, vegetables and fruits!");
    };

    public final void breath() {
        LOGGER.info("I breath oxygen from the air with my lungs!");
    };
}
