package com.dp.creational.singleton;

/**
 * Created by on 1/4/2017.
 */
public class SingletonPattern {


    /**
     * 单例的饿汉模式和懒汉模式
     * 懒汉模式存在多线程的问题，多线程下无法保证单例
     * 需要对代码控制，比如double check
     * 饿汉模式

    private static SingletonPattern singletonPattern = new SingletonPattern();

    private SingletonPattern() {

    }

    public static SingletonPattern getInstance() {
        return singletonPattern;
    }
     */

    //懒汉模式，需要考虑多线程环境,volatile关键字
    private static volatile SingletonPattern singletonPattern;



    private SingletonPattern(){

    }

    public static SingletonPattern getInstance() {
        if (singletonPattern == null) {
            synchronized (SingletonPattern.class) {
                if (singletonPattern == null) {
                    singletonPattern = new SingletonPattern();
                }
            }
        }
        return singletonPattern;
    }
}
