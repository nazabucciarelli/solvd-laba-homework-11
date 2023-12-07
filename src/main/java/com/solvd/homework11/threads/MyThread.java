package com.solvd.homework11.threads;

import com.solvd.homework11.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyThread extends Thread {
    public static final Logger LOGGER = LogManager.getLogger(Main.class);

    @Override
    public void run() {
        LOGGER.info("Thread " + Thread.currentThread().getName() + " running");
        super.run();
    }
}
