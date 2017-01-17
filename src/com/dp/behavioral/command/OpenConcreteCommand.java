package com.dp.behavioral.command;

import com.dp.structural.decorator.AbstractComponet;

/**
 * Created by Administrator on 2017/1/17.
 */
public class OpenConcreteCommand extends AbstractCommand {

    public OpenConcreteCommand(BoardScreenReceiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        this.receiver.open();
    }
}
