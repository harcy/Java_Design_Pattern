package com.dp.creational.abstractfactory;

/**
 * Created by Administrator on 2017/1/9.
 * Sunny软件公司欲推出一款新的手机游戏软件，该软件能够支持Symbian、Android和Windows Mobile
 * 等多个智能手机操作系统平台，针对不同的手机操作系统，该游戏软件提供了不同的
 * 游戏操作控制(OperationController)类和游戏界面控制(InterfaceController)类，
 * 并提供相应的工厂类来封装这些类的初始化过程。软件要求具有较好的扩展性
 * 以支持新的操作系统平台，为了满足上述需求，试采用抽象工厂模式对其进行设计。
 *
 * 代码太多，感觉太乱，增加新的产品等级结构麻烦
 */
public class AbstractFactoryPatternClient {
    public static void main(String[] args) {

        AbstractFactory abstractFactoryFactory = new AndroidFactory();
        //AbstractFactory abstractFactoryFactory = new SymbianFactory();
        InterfaceController interfaceController = abstractFactoryFactory.createInterface();
        OperationController operationController = abstractFactoryFactory.createOperation();
        interfaceController.gameInterface();
        operationController.gameOperation();
    }
}
