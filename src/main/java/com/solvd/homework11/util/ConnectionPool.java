package com.solvd.homework11.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConnectionPool {
    public static final Logger LOGGER = LogManager.getLogger(ConnectionPool.class);
    private List<Connection> connectionPool;
    private List<Connection> usedConnections = new CopyOnWriteArrayList<>();
    private static int INITIAL_POOL_SIZE = 5;

    public ConnectionPool() {
        this.connectionPool = new CopyOnWriteArrayList<>();
        for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
            this.connectionPool.add(createConnection());
        }
    }

    public synchronized Connection getConnection() throws InterruptedException {
        while (this.connectionPool.isEmpty()) {
            LOGGER.info(Thread.currentThread().getName() + " is waiting...");
            wait();
        }
        Connection connection = this.connectionPool
                .remove(this.connectionPool.size() - 1);
        this.usedConnections.add(connection);
        LOGGER.info(Thread.currentThread().getName() + " could get the connection");
        return connection;
    }

    public synchronized boolean releaseConnection(Connection connection) {
        this.connectionPool.add(connection);
        notify();
        return this.usedConnections.remove(connection);
    }

    private static Connection createConnection() {
        return new Connection();
    }
}
