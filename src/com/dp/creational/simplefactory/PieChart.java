package com.dp.creational.simplefactory;

/**
 * Created by Administrator on 2017/1/4.
 */
public class PieChart extends Chart {
    @Override
    public void displayChart() {
        System.out.println("PieChart Show");
    }

    public PieChart() {
        System.out.println("Create PieChart");
    }
}
