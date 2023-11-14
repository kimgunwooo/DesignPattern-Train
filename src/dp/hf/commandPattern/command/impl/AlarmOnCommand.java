package dp.hf.commandPattern.command.impl;

import dp.hf.commandPattern.receiver.Alarm;
import dp.hf.commandPattern.command.Command;

public class AlarmOnCommand implements Command {
    private Alarm theAlarm;
    public AlarmOnCommand(Alarm theAlarm){
        this.theAlarm = theAlarm;
    }
    @Override
    public void execute() {
        theAlarm.start();
    }
}
