package dp.hf.commandPattern.command.impl;

import dp.hf.commandPattern.receiver.Lamp;
import dp.hf.commandPattern.command.Command;

public class LampOnCommand implements Command {
    private Lamp theLamp;
    public LampOnCommand(Lamp lamp){
        this.theLamp = lamp;
    }
    @Override
    public void execute() {
        theLamp.turnOn();
    }
}
