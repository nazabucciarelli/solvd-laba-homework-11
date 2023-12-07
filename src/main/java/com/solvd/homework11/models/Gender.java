package com.solvd.homework11.models;

public class Gender {
    private String genderName;

    public Gender(String genderName) {
        this.genderName = genderName;
    }

    public String getGenderName() {
        return genderName;
    }

    public void setGenderName(String genderName) {
        this.genderName = genderName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Gender gender = (Gender) o;

        return genderName.equals(gender.genderName);
    }

    @Override
    public int hashCode() {
        return genderName.hashCode();
    }

    @Override
    public String toString() {
        return "Gender{" +
                "genderName='" + genderName + '\'' +
                '}';
    }
}
