package multiThreadingConcept2;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new MyThread());
		thread.setName("InputWaitingThread");
		thread.start();
//        Thread.sleep(100);.p
		thread.interrupt();
	}

}

class MyThread implements Runnable {

	@Override
	public void run() {
		try {
			while (true) {
				if (Thread.currentThread().isInterrupted()) {
					return;
				}
				char input = (char) System.in.read();
				if (input == 'q') {
					return;
				}
			}
		} catch (IOException e) {
			System.out.println("An exception was caught " + e);
		}
		;
	}

}