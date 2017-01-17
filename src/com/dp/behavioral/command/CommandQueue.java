package com.dp.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/1/17.
 */
public class CommandQueue {
    private List<AbstractCommand> commandList = new ArrayList<AbstractCommand>();

    public List<AbstractCommand> getCommandList() {
        return commandList;
    }

    public void setCommandList(List<AbstractCommand> commandList) {
        this.commandList = commandList;
    }

    public void addCommand(AbstractCommand command){
        this.commandList.add(command);
    }

    public void removeCommand(AbstractCommand command) {
        this.commandList.remove(command);
    }
}
