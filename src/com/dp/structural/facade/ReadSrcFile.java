package com.dp.structural.facade;

/**
 * Created by on 1/10/2017.
 */
public class ReadSrcFile {

    public String readFile(String fileName) {
        System.out.println("read file: "+ fileName);
        System.out.println("content: abcdefg");
        return "abcdefg";
    }
}
