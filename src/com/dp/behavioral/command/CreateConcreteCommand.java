package com.dp.behavioral.command;

/**
 * Created by Administrator on 2017/1/17.
 */
public class CreateConcreteCommand extends AbstractCommand {

    public CreateConcreteCommand(BoardScreenReceiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        this.receiver.create();
    }
}
