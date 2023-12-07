package com.solvd.homework11.models;

import com.solvd.homework11.interfaces.IBreath;
import com.solvd.homework11.interfaces.IEat;
import com.solvd.homework11.interfaces.ISleep;

public abstract class Animal implements IBreath, IEat, ISleep {
    private static int quantity = 0; // Using a static variable
    private String name;
    private double weight;
    private Gender gender;
    private Habitat habitat;
    private Feeding feeding;

    public Animal(String name, double weight, Gender gender, Habitat habitat,
                   Feeding feeding) {
        this.name = name;
        this.weight = weight;
        this.gender = gender;
        this.habitat = habitat;
        this.feeding = feeding;
        quantity += 1;
    }

    //Using static method
    public static int getQuantityOfAnimals(){
        return quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    public Feeding getFeeding() {
        return feeding;
    }

    public void setFeeding(Feeding feeding) {
        this.feeding = feeding;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (Double.compare(weight, animal.weight) != 0) return false;
        if (!name.equals(animal.name)) return false;
        if (!gender.equals(animal.gender)) return false;
        if (!habitat.equals(animal.habitat)) return false;
        return feeding.equals(animal.feeding);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + gender.hashCode();
        result = 31 * result + habitat.hashCode();
        result = 31 * result + feeding.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", gender=" + gender +
                ", habitat=" + habitat +
                ", feeding=" + feeding +
                '}';
    }
}
