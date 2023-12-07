package com.solvd.homework11.enums;

public enum State {
    ACTIVE("Active", 1), INACTIVE("Inactive", 0);

    private String name;
    private int value;

    State(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public boolean getBoolean() {
        return this.value == 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
