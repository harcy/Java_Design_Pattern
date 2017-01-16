package com.dp.structural.bridge;

/**
 * Created by Administrator on 2017/1/16.
 */
public class JpgRefinedAbstraction extends Abstraction {

    public JpgRefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void parseFile() {
        System.out.println("parse JPG file");
    }
}
