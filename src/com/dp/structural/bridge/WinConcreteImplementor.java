package com.dp.structural.bridge;

/**
 * Created by Administrator on 2017/1/16.
 */
public class WinConcreteImplementor implements Implementor {
    @Override
    public void drawMatrix() {
        System.out.println("draw Matrix use Windows function");
    }
}
