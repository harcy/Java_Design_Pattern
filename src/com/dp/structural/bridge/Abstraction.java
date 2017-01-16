package com.dp.structural.bridge;

/**
 * Created by Administrator on 2017/1/16.
 */
public abstract class Abstraction {

    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void parseFile();

    public void drawImage(){
        this.implementor.drawMatrix();
    }
}
