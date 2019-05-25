package com.example.designpattern.ch06.command.homeautomationsol;

import com.example.designpattern.ch06.command.homeautomation.Tv;

public class TvOnCommand implements Command {
	private Tv tv;
	
	public TvOnCommand(Tv tv) {
		// TODO Auto-generated constructor stub
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		tv.off();
	}

}
