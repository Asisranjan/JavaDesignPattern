package com.example.designpattern.ch12.mvc;

public class HeartAdapter implements BeatModelInterface {
	HeartModelInterface heartModel;
	public HeartAdapter(HeartModelInterface heart) {
		// TODO Auto-generated constructor stub
		this.heartModel = heart;
	}
	
	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void on() {
		// TODO Auto-generated method stub

	}

	@Override
	public void off() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setBPM(int bpm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getBPM() {
		// TODO Auto-generated method stub
		return heartModel.getHeartRate();
	}

	@Override
	public void registerObserver(BeatObserver o) {
		// TODO Auto-generated method stub
		heartModel.registerObserver(o);
	}

	@Override
	public void removeObserver(BeatObserver o) {
		// TODO Auto-generated method stub
		heartModel.removeObserver(o);
	}

	@Override
	public void registerObserver(BPMObserver o) {
		// TODO Auto-generated method stub
		heartModel.registerObserver(o);
	}

	@Override
	public void removeObserver(BPMObserver o) {
		// TODO Auto-generated method stub
		heartModel.removeObserver(o);
	}

}
