package com.dp.creational.singleton;

/**
 * Created by on 1/4/2017.
 */
public class SingletonPattern {

    private static SingletonPattern singletonPattern;


    private SingletonPattern(){

    }

    public static SingletonPattern getInstance() {
        if (singletonPattern == null) {
            singletonPattern = new SingletonPattern();
        }
        return singletonPattern;
    }
}
