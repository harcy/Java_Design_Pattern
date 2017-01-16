package com.dp.creational.prototype;

/**
 * Created by Administrator on 2017/1/16.
 *
 * 浅克隆 & 深克隆
 * 主要是在于引用类型的克隆，分克隆引用对象的指针 & 克隆引用对象的实际值
 * 深克隆可以通过序列化的方式实现，通过序列化克隆对象
 *
 */
public class PrototypePatternClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setName("Lucy");
        prototype.setCupSize("F");
        System.out.println(prototype.toString());
        ConcretePrototype prototypeClone = prototype.clone();
        System.out.println(prototypeClone.toString());
        System.out.println(prototype == prototypeClone);
    }
}
