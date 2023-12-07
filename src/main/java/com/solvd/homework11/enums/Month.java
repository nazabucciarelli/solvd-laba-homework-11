package com.solvd.homework11.enums;

public enum Month {
    JANUARY("January", 1), FEBRUARY("February", 2), MARCH("March", 3), MAY("May", 4),
    APRIL("April", 5), JUNE("June", 6), JULY("July", 7), AUGUST("August", 8),
    SEPTEMBER("September", 9), OCTOBER("October", 10), NOVEMBER("November", 11),
    DECEMBER("December", 12);

    private String name;
    private int number;

    Month(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public boolean isChristmasMonth() {
        return this.name.equals("December");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
