package com.tomsovi.threads1;

public class Counter {
	int count;

	public Counter(int count) {
		this.count = count;
	}

	public void decrement() {
		count--;
	}

	public int getCount() {
		return count;
	}
}
