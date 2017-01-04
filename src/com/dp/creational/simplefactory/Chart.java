package com.dp.creational.simplefactory;

/**
 * Created by Administrator on 2017/1/4.
 */
public abstract class Chart {

    public abstract void displayChart();

   /* public static Chart getChart(String type) {
        Chart chart = null;
        if (type.equalsIgnoreCase("piechart")) {
            chart = new PieChart();
        }
        return chart;
    }*/
}
