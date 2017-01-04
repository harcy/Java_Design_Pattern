package com.dp.creational.simplefactory;

/**
 * Created by Administrator on 2017/1/4.
 */
public class ChartFactory {

    public static Chart getChart(String type) {
        if (type.equalsIgnoreCase("piechart")) {
            return new PieChart();
        } else if (type.equalsIgnoreCase("linechart")) {
            return new LineChart();
        } else {
            return null;
        }
    }
}
