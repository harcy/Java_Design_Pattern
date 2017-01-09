package com.dp.creational.abstractfactory;

/**
 * Created by Administrator on 2017/1/9.
 */
public class WinMobileFactory implements AbstractFactory {
    @Override
    public InterfaceController createInterface() {
        return new WinMobileInterfaceController();
    }

    @Override
    public OperationController createOperation() {
        return new WinMobileOperationController();
    }
}
