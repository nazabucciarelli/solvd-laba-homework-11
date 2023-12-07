package com.solvd.homework11.models;

public class Feeding {
    private String name;

    public Feeding(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Feeding feeding = (Feeding) o;

        return name.equals(feeding.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Feeding{" +
                "name='" + name + '\'' +
                '}';
    }

}
