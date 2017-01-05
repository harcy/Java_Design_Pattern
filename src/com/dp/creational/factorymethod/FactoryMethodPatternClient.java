package com.dp.creational.factorymethod;

/**
 * Created by I337300 on 1/5/2017.
 */
public class FactoryMethodPatternClient {
    public static void main(String[] args) {
        //LoggerFactory loggerFactory = new DatabaseFactory();
        LoggerFactory loggerFactory = new FileFactory();
        ILogger iLogger = loggerFactory.createLogger();
        iLogger.writeLog();
    }
}
