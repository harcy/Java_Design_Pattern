package com.dp.creational.prototype;

/**
 * Created by Administrator on 2017/1/16.
 */
public class ConcretePrototype implements Cloneable {
    private String name;

    private String cupSize;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    @Override
    public String toString() {
        return "Name: "+ this.name +"; "+
                "CupSize: "+ this.cupSize;
    }

    @Override
    protected ConcretePrototype clone() throws CloneNotSupportedException {
        Object object = super.clone();
        return (ConcretePrototype)object;
    }
}
