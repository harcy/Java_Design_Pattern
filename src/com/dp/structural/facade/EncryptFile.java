package com.dp.structural.facade;

/**
 * Created by on 1/10/2017.
 */
public class EncryptFile {

    public String encryptContent(String content) {
        StringBuilder sb = new StringBuilder(content);
        System.out.println("content: "+content);
        String encryptContent = sb.reverse().toString();
        System.out.println("encrypt content: "+encryptContent);
        return encryptContent;
    }
}
