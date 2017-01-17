package com.dp.behavioral.command;

import java.util.List;

/**
 * Created by Administrator on 2017/1/17.
 */
public class Invoker {

    /*
    //用来处理多个请求接收者产生响应
    private CommandQueue commandQueue;

    public Invoker(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    public void sendRequest() {
        List<AbstractCommand> commandList =  commandQueue.getCommandList();
        for (AbstractCommand command:commandList) {
            command.execute();
        }
    }*/
    private  AbstractCommand command;

    public Invoker(AbstractCommand command) {
        this.command = command;
    }

    public void sendRequest() {
        command.execute();
    }
}
