package com.dp.creational.factorymethod;

/**
 * Created by I337300 on 1/5/2017.
 */
public class DatabaseFactory implements LoggerFactory {
    @Override
    public ILogger createLogger() {
        return new DatabaseLogger();
    }
}
