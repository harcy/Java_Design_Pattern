package com.dp.behavioral.observer;

/**
 * Created by I337300 on 1/5/2017.
 */
public class ObserverPatternClient {
    public static void main(String[] args) {
        Subject subject = new WeatherSubject();
        Observer observer = new BoyObserver();
        Observer observer1 = new GirlObserver();
        subject.attach(observer);
        subject.attach(observer1);
        subject.updateInfo("sunshine");
        subject.detach(observer);
        subject.updateInfo("sunshine");
    }
}
