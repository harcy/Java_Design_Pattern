package com.dp.creational.simplefactory;

/**
 * Created by Administrator on 2017/1/4.
 */
public class SimpleFactoryPatternClient {
    public static void main(String[] args) {
        //Graph graph = Graph.getGraph("triangle");
        Graph graph = Graph.getGraph("circle");
        graph.erase();
    }
}
