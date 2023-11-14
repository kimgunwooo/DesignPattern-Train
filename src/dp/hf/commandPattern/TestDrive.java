package dp.hf.commandPattern;

import dp.hf.MyHWInfo;
import dp.hf.commandPattern.invoker.Button;
import dp.hf.commandPattern.command.impl.AlarmOnCommand;
import dp.hf.commandPattern.command.Command;
import dp.hf.commandPattern.command.impl.LampOnCommand;
import dp.hf.commandPattern.receiver.Alarm;
import dp.hf.commandPattern.receiver.Lamp;

public class TestDrive {
    public static void main(String[] args) {
        MyHWInfo.printInfo();

        Lamp lamp = new Lamp();
        Command lampOnCommand = new LampOnCommand(lamp);

        Button button1 = new Button(lampOnCommand);
        button1.pressed();

        Alarm alarm = new Alarm();
        Command alarmOnCommand = new AlarmOnCommand(alarm);

        Button button2 = new Button(alarmOnCommand);
        button2.pressed();

        button2.setCommand(lampOnCommand);
        button2.pressed();
    }
}
