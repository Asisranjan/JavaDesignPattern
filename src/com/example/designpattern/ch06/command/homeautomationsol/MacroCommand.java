package com.example.designpattern.ch06.command.homeautomationsol;

public class MacroCommand implements Command {
	private Command[] command;
	
	public MacroCommand(Command[] command) {
		// TODO Auto-generated constructor stub
		this.command = command;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		for (int i = 0; i < command.length; i++) {
			command[i].execute();
		}
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		for (int i = 0; i < command.length; i++) {
			command[i].undo();
		}
	}

}
