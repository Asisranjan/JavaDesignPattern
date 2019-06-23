package com.example.designpattern.ch07.facade.hometheatre;

public class HomeTheaterTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amplifier amplifier = new Amplifier();
		CdPlayer cdPlayer = new CdPlayer();
		DvdPlayer dvdPlayer = new DvdPlayer();
		PopcornPopper popcornPopper = new PopcornPopper();
		Projector projector = new Projector();
		Screen screen = new Screen();
		Tuner tuner = new Tuner();
		TheaterLights theaterLights = new TheaterLights();
		
		HomeTheaterFacade facade = new HomeTheaterFacade(amplifier, tuner, dvdPlayer, cdPlayer, projector, theaterLights, screen, popcornPopper);
		facade.watchMovie("DDLJ");
		facade.endMovie();
	}

}
