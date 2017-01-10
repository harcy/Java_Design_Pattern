package com.dp.structural.adapter;

/**
 * Created by Administrator on 2017/1/10.
 */
public class Adapter implements AbstractAdapter {

    private Adaptee adaptee;
    private InfoDao infoDao;

    public Adapter() {
        this.adaptee = new Adaptee();
        this.infoDao = new InfoDao();
    }

    @Override
    public void saveInfo(String content) {
        System.out.println("------加密前内容------");
        System.out.println("content: "+ content);
        String info = adaptee.encryptInfo(content);
        System.out.println("------加密后内容------");
        System.out.println("content: "+ info);
        infoDao.saveInfo(info);
        System.out.println("------保存到数据库的内容------");
        System.out.println("successful insert content to db: "+ info);
    }
}
