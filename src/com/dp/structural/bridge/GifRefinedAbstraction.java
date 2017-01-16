package com.dp.structural.bridge;

/**
 * Created by Administrator on 2017/1/16.
 */
public class GifRefinedAbstraction extends Abstraction {

    public GifRefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void parseFile() {
        System.out.println("parse GIF file");
    }
}
