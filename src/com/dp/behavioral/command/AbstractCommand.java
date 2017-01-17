package com.dp.behavioral.command;

/**
 * Created by Administrator on 2017/1/17.
 */
public abstract class AbstractCommand {

    protected BoardScreenReceiver receiver;

    public AbstractCommand(BoardScreenReceiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
