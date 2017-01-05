package com.dp.behavioral.observer;

/**
 * Created by I337300 on 1/5/2017.
 */
public class GirlObserver implements Observer {
    @Override
    public void updateMsg(String msg) {
        System.out.println("hi, let's together!"+msg);
    }
}
