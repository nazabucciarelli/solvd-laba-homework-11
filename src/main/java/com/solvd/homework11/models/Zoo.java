package com.solvd.homework11.models;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Zoo {
    private static final Logger LOGGER = LogManager.getLogger(Zoo.class);
    private static final int CUSTOMERS_CAPACITY = 50; // Using final var.
    private String name;
    private List<AnimalRoom> animalRooms;
    private List<Department> departments;

    static{ // Using a static block
        LOGGER.info("The capacity of the zoo is of "
                            + CUSTOMERS_CAPACITY + " customers");
    }

    public Zoo(String name, List<AnimalRoom> animalRooms, List<Department> departments){
        this.name = name;
        this.animalRooms = animalRooms;
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AnimalRoom> getAnimalRooms() {
        return animalRooms;
    }

    public void setAnimalRooms(List<AnimalRoom> animalRooms) {
        this.animalRooms = animalRooms;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Zoo zoo = (Zoo) o;

        if (!name.equals(zoo.name)) return false;
        if (!animalRooms.equals(zoo.getAnimalRooms())) return false;
        return departments.equals(zoo.getDepartments());
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + animalRooms.hashCode();
        result = 31 * result + departments.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", animalRooms=" + animalRooms +
                ", departments=" + departments +
                '}';
    }
}
