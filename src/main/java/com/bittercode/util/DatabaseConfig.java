package com.bittercode.util;

import org.checkerframework.checker.nullness.qual.Nullable;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

// Suppressing Warning here because input might be null, causing a Null Pointer Exception at line 23
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

    public final static @Nullable String DRIVER_NAME = prop.getProperty("db.driver");
    public final static @Nullable String DB_HOST = prop.getProperty("db.host");
    public final static @Nullable String DB_PORT = prop.getProperty("db.port");
    public final static @Nullable String DB_NAME = prop.getProperty("db.name");
    public final static @Nullable String DB_USER_NAME = prop.getProperty("db.username");
    public final static @Nullable String DB_PASSWORD = prop.getProperty("db.password");
    public final static String CONNECTION_STRING = DB_HOST + ":" + DB_PORT + "/" + DB_NAME;

}
