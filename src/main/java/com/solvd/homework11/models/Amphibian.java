package com.solvd.homework11.models;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Amphibian extends Animal{
    private static final Logger LOGGER = LogManager.getLogger(Amphibian.class);

    public Amphibian(String name, double weight, Gender gender, Habitat habitat,
                     Feeding feeding) {
        super(name, weight, gender, habitat, feeding);
    }

    @Override
    public void breath() {
        LOGGER.info("I can breath in the water and outside of it!");
    }

    @Override
    public void eat() {
        LOGGER.info("I like eating worms and other bugs!");
    }

    @Override
    public void sleep() {
        LOGGER.info("I usually sleep in cold or wet places!");
    }
}
