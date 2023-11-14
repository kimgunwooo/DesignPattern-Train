package dp.hf.commandPattern.invoker;

import dp.hf.commandPattern.command.Command;

public class Button {
    private Command theCommand;

    public Button(Command theCommand) {
        setCommand(theCommand);
    }

    public void setCommand(Command theCommand) {
        this.theCommand = theCommand;
    }

    public void pressed() {
        theCommand.execute();
    }


}
