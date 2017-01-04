package com.dp.creational.simplefactory;

/**
 * Created by Administrator on 2017/1/4.
 */
public class TriangleGraph extends Graph {
    @Override
    public Graph draw() {
        TriangleGraph triangleGraph = new TriangleGraph();
        System.out.println("draw Triangle");
        return triangleGraph;
    }

    @Override
    public void erase() {
        System.out.println("erase Triangle");
    }
}
