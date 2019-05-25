package com.example.designpattern.ch06.command.homeautomationsol;

import com.example.designpattern.ch06.command.homeautomation.Tv;

public class TvOffCommand implements Command {
	private Tv tv;
	
	public TvOffCommand(Tv tv) {
		// TODO Auto-generated constructor stub
		this.tv = tv;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv.off();

	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		tv.on();
	}

}
