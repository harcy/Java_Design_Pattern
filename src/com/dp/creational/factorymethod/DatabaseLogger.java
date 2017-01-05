package com.dp.creational.factorymethod;

/**
 * Created by I337300 on 1/5/2017.
 */
public class DatabaseLogger implements ILogger {
    @Override
    public void writeLog() {
        System.out.println("connecting database");
        System.out.println("write log to database");
    }
}
