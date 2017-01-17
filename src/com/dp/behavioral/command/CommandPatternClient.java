package com.dp.behavioral.command;

/**
 * Created by Administrator on 2017/1/17.
 *
 * Sunny软件公司欲开发一个基于Windows平台的公告板系统。该系统提供了一个主菜单(Menu)，
 * 在主菜单中包含了一些菜单项(MenuItem)，可以通过Menu类的addMenuItem()方法增加菜单项。
 * 菜单项的主要方法是click()，每一个菜单项包含一个抽象命令类，
 * 具体命令类包括OpenCommand(打开命令)，CreateCommand(新建命令)，EditCommand(编辑命令)等，
 * 命令类具有一个execute()方法，用于调用公告板系统界面类(BoardScreen)的open()、create()、edit()等方法。
 * 试使用命令模式设计该系统，以便降低MenuItem类与BoardScreen类之间的耦合度。
 *
 */
public class CommandPatternClient {
    public static void main(String[] args) {
        BoardScreenReceiver receiver = new BoardScreenReceiver();
        AbstractCommand command = new EditConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.sendRequest();

       /*
        //针对一个请求者发送一个请求，使用多个请求接收者去处理该请求
        //有时候我们需要将多个请求排队，当一个请求发送者发送一个请求时，
        //将不止一个请求接收者产生响应，这些请求接收者将逐个执行业务方法，完成对请求的处理。
        //此时，我们可以通过命令队列来实现。
        BoardScreenReceiver receiver = new BoardScreenReceiver();
        AbstractCommand command = new EditConcreteCommand(receiver);
        AbstractCommand command1 = new CreateConcreteCommand(receiver);
        AbstractCommand command2 = new OpenConcreteCommand(receiver);
        CommandQueue commandQueue = new CommandQueue() ;
        commandQueue.addCommand(command);
        commandQueue.addCommand(command1);
        commandQueue.addCommand(command2);
        Invoker invoker = new Invoker(commandQueue);
        invoker.sendRequest();*/
    }
}
