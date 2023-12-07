package com.solvd.homework11.threads;

import com.solvd.homework11.util.Connection;
import com.solvd.homework11.util.ConnectionPool;

import java.util.concurrent.Callable;

public class CallableConnectionThread implements Callable<String> {
    private final ConnectionPool CONNECTION_POOL;

    public CallableConnectionThread(ConnectionPool CONNECTION_POOL) {
        this.CONNECTION_POOL = CONNECTION_POOL;
    }

    @Override
    public String call() throws Exception {
        Connection connection = this.CONNECTION_POOL.getConnection();
        Thread.sleep(4000);
        this.CONNECTION_POOL.releaseConnection(connection);
        return "Connection released!";
    }
}
