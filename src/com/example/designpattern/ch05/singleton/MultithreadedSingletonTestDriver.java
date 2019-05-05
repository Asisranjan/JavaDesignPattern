package com.example.designpattern.ch05.singleton;

public class MultithreadedSingletonTestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Singleton.getInstance());
			}
			
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		
		t1.start();
		t2.start();

	}

}
