package com.dp.behavioral.command;

/**
 * Created by Administrator on 2017/1/17.
 */
public class EditConcreteCommand extends AbstractCommand {
    public EditConcreteCommand(BoardScreenReceiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        this.receiver.edit();
    }
}
