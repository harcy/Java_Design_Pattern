package com.dp.structural.decorator;

/**
 * Created by Administrator on 2017/1/14.
 */
public class Decorator implements AbstractComponet {

    private AbstractComponet componet;

    public Decorator(AbstractComponet componet) {
        this.componet = componet;
    }

    @Override
    public String encryptString(String str) {
        return componet.encryptString(str);
    }
}
