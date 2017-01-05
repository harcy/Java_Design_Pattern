package com.dp.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by I337300 on 1/5/2017.
 */
public class WeatherSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    @Override
    public List<Observer> attach(Observer observer) {
        observers.add(observer);
        return observers;
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void updateInfo(String msg) {
        for (Observer observer : observers
             ) {
            observer.updateMsg(msg);
        }
    }
}
