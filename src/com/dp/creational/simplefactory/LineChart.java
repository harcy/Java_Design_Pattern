package com.dp.creational.simplefactory;

/**
 * Created by Administrator on 2017/1/4.
 */
public class LineChart extends Chart {
    @Override
    public void displayChart() {
        System.out.println("LineChart Show");
    }

    public LineChart() {
        System.out.println("Create LinChart");
    }
}
