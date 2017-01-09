package com.dp.creational.abstractfactory;

/**
 * Created by Administrator on 2017/1/9.
 */
public class AndroidFactory implements AbstractFactory {
    @Override
    public InterfaceController createInterface() {
        return new AndroidInterfaceController();
    }

    @Override
    public OperationController createOperation() {
        return new AndroidOperationController();
    }
}
