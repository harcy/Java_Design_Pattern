package com.dp.creational.simplefactory;

/**
 * Created by Administrator on 2017/1/4.
 */
public abstract class Graph {
    public abstract Graph draw();

    public abstract void erase();

    public static Graph getGraph(String graphType) {
        Graph graph = null;
        if (graphType.equalsIgnoreCase("circle")) {
            graph = new CircleGraph().draw();
        } else if (graphType.equalsIgnoreCase("triangle")) {
            graph = new TriangleGraph().draw();
        }
        return graph;
    }
}
