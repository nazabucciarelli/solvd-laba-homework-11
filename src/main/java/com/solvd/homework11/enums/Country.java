package com.solvd.homework11.enums;

public enum Country {
    ARGENTINA("Argentina"), MEXICO("Mexico"), BELARUS("Belarus"), POLAND("Poland");

    private String name;

    Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
