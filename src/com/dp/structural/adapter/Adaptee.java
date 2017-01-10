package com.dp.structural.adapter;

/**
 * Created by Administrator on 2017/1/10.
 */
public class Adaptee {

    public String encryptInfo(String content) {
        StringBuilder sb = new StringBuilder(content);
        return sb.reverse().toString();
    }
}
