package com.dp.creational.singleton;

import com.sun.deploy.security.ruleset.RuleAction;
import com.sun.xml.internal.bind.v2.model.annotation.RuntimeAnnotationReader;

/**
 * Created by on 1/4/2017.
 */
public class SingletonClient{

    public static void main(String[] args) {
        SingletonPattern singletonPattern = SingletonPattern.getInstance();
        System.out.println(singletonPattern.hashCode());
        SingletonPattern singletonPattern1 = SingletonPattern.getInstance();
        System.out.println(singletonPattern1.hashCode());
    }

}
