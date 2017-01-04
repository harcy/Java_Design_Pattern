package com.dp.creational.simplefactory;

/**
 * Created by Administrator on 2017/1/4.
 */

/**
 *简单工厂模式：定义一个工厂类，根据参数返回不同类型的实例，被创建的实例通常具有共同的父类
 * 因为在简单工厂模式中用于创建实例的方法是静态的static方法，因此该模式又被叫做
 * 静态工厂方法模式(Static Factory Method)
 *  */
public class SimpleFactoryPatternTest {
    public static void main(String[] args) {
        Chart chart = ChartFactory.getChart("PieChart");
        chart.displayChart();
        Chart chart1 = ChartFactory.getChart("LineChart");
        chart1.displayChart();
    }
}
