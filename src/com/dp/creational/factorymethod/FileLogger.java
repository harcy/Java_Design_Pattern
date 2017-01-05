package com.dp.creational.factorymethod;

/**
 * Created by I337300 on 1/5/2017.
 */
public class FileLogger implements ILogger {
    @Override
    public void writeLog() {
        System.out.println("create file");
        System.out.println("write log to file");
    }
}
