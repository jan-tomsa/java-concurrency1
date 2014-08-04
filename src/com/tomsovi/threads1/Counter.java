package com.tomsovi.threads1;

public class Counter {
	private int count;

	public Counter(int count) {
		this.count = count;
	}

	public synchronized void decrement() {
		count--;
	}

	public int getCount() {
		return count;
	}
}
