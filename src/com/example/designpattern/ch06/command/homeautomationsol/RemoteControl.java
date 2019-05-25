package com.example.designpattern.ch06.command.homeautomationsol;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		this.onCommands[slot] = onCommand;
		this.offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPressed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void offButtonWasPressed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonWasPressed() {
		undoCommand.undo();
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("RemoteControl\n");
		for (int i = 0; i < 7; i++) {
			sb.append("slot="+i+",onCommand="+onCommands[i].getClass().getSimpleName()+",offCommand="+offCommands[i].getClass().getSimpleName()+"\n");
		}
		return sb.toString();
	}
}
