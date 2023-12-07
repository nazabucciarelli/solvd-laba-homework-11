package com.solvd.homework11.models;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Bird extends Animal{
    private static final Logger LOGGER = LogManager.getLogger(Bird.class);

    public Bird(String name, double weight, Gender gender, Habitat habitat,
                Feeding feeding) {
        super(name, weight, gender, habitat, feeding);
    }

    @Override
    public void breath() {
        LOGGER.info("I breath oxygen from the air!");
    }

    @Override
    public void eat() {
        LOGGER.info("I eat seeds and worms!");
    }

    @Override
    public void sleep() {
        LOGGER.info("I like sleeping in branches from trees!");
    }
}
