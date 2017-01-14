package com.dp.structural.decorator;

/**
 * Created by Administrator on 2017/1/14.
 */
public class ThirdDecorator extends Decorator {
    public ThirdDecorator(AbstractComponet componet) {
        super(componet);
    }

    @Override
    public String encryptString(String str) {
        String firstStr = super.encryptString(str);
        String result = firstStr + "!@#$";
        System.out.println(result + " from ThridDecorator");
        return result;
    }
}
