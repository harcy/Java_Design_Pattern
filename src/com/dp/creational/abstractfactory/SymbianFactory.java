package com.dp.creational.abstractfactory;

/**
 * Created by Administrator on 2017/1/9.
 */
public class SymbianFactory implements AbstractFactory {
    @Override
    public InterfaceController createInterface() {
        return new SymbianInterfaceController();
    }

    @Override
    public OperationController createOperation() {
        return new SymbianOperationController();
    }
}
