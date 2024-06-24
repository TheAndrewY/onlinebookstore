package com.bittercode.util;

import org.checkerframework.checker.nullness.qual.MonotonicNonNull;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

// Suppressing Warning here because input might be null, causing an argument warning at line 27
// Even though the catch block deals with all possible exceptions thrown.

@SuppressWarnings("argument")class DatabaseConfig {

    static Properties prop = new Properties();
    static {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        //Restructured input initialization to account for possible null referencing.
        InputStream input = (classLoader!=null ? classLoader.getResourceAsStream("application.properties") : null);

        try {
             prop.load(input);
        } catch (IOException | NullPointerException e ) {
            e.printStackTrace();
        }
    }

    public final static @MonotonicNonNull String DRIVER_NAME = prop.getProperty("db.driver");
    public final static @MonotonicNonNull String DB_HOST = prop.getProperty("db.host");
    public final static @MonotonicNonNull String DB_PORT = prop.getProperty("db.port");
    public final static @MonotonicNonNull String DB_NAME = prop.getProperty("db.name");
    public final static @MonotonicNonNull String DB_USER_NAME = prop.getProperty("db.username");
    public final static @MonotonicNonNull String DB_PASSWORD = prop.getProperty("db.password");
    public final static  String CONNECTION_STRING = DB_HOST + ":" + DB_PORT + "/" + DB_NAME;

}
