package com.dp.creational.singleton;

/**
 * Created by on 1/4/2017.
 */
public class SingletonTest {

    public static void main(String[] args) {
        SingletonPattern singletonPattern = SingletonPattern.getInstance();
        System.out.println(singletonPattern.hashCode());
        SingletonPattern singletonPattern1 = SingletonPattern.getInstance();
        System.out.println(singletonPattern1.hashCode());
    }

}
