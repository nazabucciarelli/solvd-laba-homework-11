package com.solvd.homework11.threads;

import com.solvd.homework11.util.Connection;
import com.solvd.homework11.util.ConnectionPool;

import java.util.Random;

public class ConnectionThread implements Runnable {
    ConnectionPool connectionPool;

    public ConnectionThread(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    @Override
    public void run() {
        try {
            Connection connection = this.connectionPool.getConnection();
            Thread.sleep((new Random().nextInt(6) + 5) * 1000);
            this.connectionPool.releaseConnection(connection);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
