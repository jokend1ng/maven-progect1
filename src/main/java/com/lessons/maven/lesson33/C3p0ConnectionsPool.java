package com.lessons.maven.lesson33;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class C3p0ConnectionsPool {
    private static ComboPooledDataSource poll = new ComboPooledDataSource();
//    static {
//        программные настройки
//        pool.setUser("postgres");
//    }
    public static Connection getConnectionFromPool() throws SQLException {
        return poll.getConnection();
    }
}
