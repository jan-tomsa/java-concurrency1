package com.tomsovi.threads1;

public class MyThread extends Thread {
	private final int i;

	public MyThread(int i) {
		this.i = i;
	}

	@Override
	public void run() {
		System.out.println("MyThread #" + i + " running");
	}
}
