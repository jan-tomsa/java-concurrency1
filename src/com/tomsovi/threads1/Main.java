package com.tomsovi.threads1;

import java.util.concurrent.TimeUnit;

public class Main {

	private static final int THREAD_COUNT = 10000;

	public static void main(String[] args) {
		Main main = new Main();
	    main.execute();
    }

	private void execute() {
		// setup a counter
		Counter counter = new Counter(THREAD_COUNT);
		// create a bunch of threads
		for (int i=0; i< THREAD_COUNT; i++) {
			Thread myThread = new Thread(new MyThread(i,counter));
			myThread.start();
		}
		// wait for the threads to finish
		int justForSureCounter = 10; // give the threads 10 seconds to finish
		while ((counter.getCount() > 0) && (justForSureCounter > 0)) {
			waitASecond();
			justForSureCounter--;
			int liveCount = counter.getCount();
			System.out.println("------------- Waiting for threads to finish (count = " + liveCount + ") -------------");
		}
		// print the final value of counter - if > 0 then race condition occured
		System.out.println("================== Main finished (count = " + counter.getCount() + ") ==================");
	}

	private void waitASecond() {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			//Handle exception
		}
	}
}
