package com.dp.creational.simplefactory;

/**
 * Created by Administrator on 2017/1/4.
 */
public class CircleGraph extends Graph {
    @Override
    public Graph draw() {
        CircleGraph circleGraph = new CircleGraph();
        System.out.println("draw Circle");
        return circleGraph;
    }

    @Override
    public void erase() {
        System.out.println("erase Circle");
    }
}
