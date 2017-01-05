package com.dp.behavioral.observer;

import java.util.List;

/**
 * Created by I337300 on 1/5/2017.
 */
public interface Subject {

    List<Observer> attach(Observer observer);

    void detach(Observer observer);

    void updateInfo(String msg);
}
