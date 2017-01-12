package com.dp.behavioral.strategy;

/**
 * Created by Administrator on 2017/1/12.
 */
public class Context {
    private AbstractStrategy abstractStrategy;

    public Context(AbstractStrategy abstractStrategy) {
        this.abstractStrategy = abstractStrategy;
    }

    public String TakeOffFeature() {
        return abstractStrategy.getTakeOffFeature();
    }

    public String FlyFeature() {
        return abstractStrategy.getFlyFeature();
    }


}
