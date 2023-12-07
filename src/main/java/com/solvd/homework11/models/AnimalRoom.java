package com.solvd.homework11.models;

import java.util.List;

public class AnimalRoom {
    private String name;
    private List<Animal> animals;
    private int capacity;

    public AnimalRoom(String name, List<Animal> animals, int capacity) {
        this.name = name;
        this.animals = animals;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnimalRoom that = (AnimalRoom) o;

        if (capacity != that.capacity) return false;
        if (!name.equals(that.name)) return false;
        return animals.equals(that.getAnimals());
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + animals.hashCode();
        result = 31 * result + capacity;
        return result;
    }

    @Override
    public String toString() {
        return "AnimalRoom{" +
                "name='" + name + '\'' +
                ", animals=" + animals +
                ", capacity=" + capacity +
                '}';
    }
}
