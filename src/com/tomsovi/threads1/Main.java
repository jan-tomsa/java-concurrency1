package com.tomsovi.threads1;

public class Main {

    public static void main(String[] args) {
		Main main = new Main();
	    main.execute();
    }

	private void execute() {
		for (int i=0; i<1000; i++) {
			MyThread myThread = new MyThread(i);
			myThread.start();
		}
		System.out.println("================== Main finished ==================");
	}
}
