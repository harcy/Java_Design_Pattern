package com.dp.behavioral.template;


/**
 * Created by on 1/19/2017.
 */
public abstract class Account {


    public Boolean ValidateUser(String name,String pwd){
        if (name.equals("wei xiaobao") && pwd.equals("123")) {
            return true;
        }
        return false;
    }

    public abstract void CalInterest();

    public void ShowInterest(){
        System.out.println("show user Interest");
    }
    public void HandleInterest(String userName,String userPwd){

        Boolean flag = ValidateUser(userName,userPwd);
        if (flag) {
            CalInterest();
            ShowInterest();
            return;
        }
        System.out.println("User is not exist, Please check your name or pwd");


    }
}
