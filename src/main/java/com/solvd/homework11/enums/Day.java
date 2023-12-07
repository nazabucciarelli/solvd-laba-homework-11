package com.solvd.homework11.enums;

public enum Day {
    MONDAY("Monday", 1), TUESDAY("Tuesday", 2), WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4), FRIDAY("Friday", 5), SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);

    private String name;
    private int number;

    Day(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public boolean isWeekend() {
        return this.name.equals("Saturday") || this.name.equals("Sunday");
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
