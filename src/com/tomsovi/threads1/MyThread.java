package com.tomsovi.threads1;

public class MyThread implements Runnable {
	private final int i;
	private final Counter counter;

	public MyThread(int i, Counter counter) {
		this.i = i;
		this.counter = counter;
	}

	@Override
	public void run() {
		counter.decrement();
		System.out.println("MyThread #" + i + " running");
	}
}
