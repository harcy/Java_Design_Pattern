package com.dp.structural.decorator;

/**
 * Created by Administrator on 2017/1/14.
 */
public class ConcreteComponent implements AbstractComponet {
    @Override
    public String encryptString(String str) {
        String result = str.toUpperCase();
        System.out.println(result + " from ConcreteComponent");
        return result;
    }
}
