package com.dp.structural.decorator;

/**
 * Created by Administrator on 2017/1/14.
 *
 * Sunny软件公司欲开发了一个数据加密模块，可以对字符串进行加密。
 * 最简单的加密算法通过对字母进行全部大写来实现，同时还提供了稍复杂的逆向输出加密，
 * 还提供了添加了！@#￥明文字符。用户先使用最简单的加密算法对字符串进行加密，
 * 如果觉得还不够可以对加密之后的结果使用其他加密算法进行二次加密，
 * 当然也可以进行第三次加密。试使用装饰模式设计该多重加密系统
 *
 */
public class DecoratorPatternClient {
    public static void main(String[] args) {
        AbstractComponet componet1,componet2,componet3;
        componet1 = new ConcreteComponent();
        componet2 = new SecondDecorator(componet1);
        //componet2.encryptString("abcd");
        componet3 = new ThirdDecorator(componet2);
        componet3.encryptString("abcd");
    }
}
