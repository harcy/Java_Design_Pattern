package com.dp.creational.abstractfactory;

/**
 * Created by Administrator on 2017/1/9.
 */
public interface AbstractFactory {

    InterfaceController createInterface();
    OperationController createOperation();
}
