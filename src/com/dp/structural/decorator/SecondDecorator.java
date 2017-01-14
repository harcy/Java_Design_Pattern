package com.dp.structural.decorator;

/**
 * Created by Administrator on 2017/1/14.
 */
public class SecondDecorator extends Decorator {
    public SecondDecorator(AbstractComponet componet) {
        super(componet);
    }

    @Override
    public String encryptString(String str) {
        String firstStr = super.encryptString(str);
        String result  = new StringBuilder(firstStr).reverse().toString();
        System.out.println(result + " from SecondDecorator");
        return result;
    }
}
