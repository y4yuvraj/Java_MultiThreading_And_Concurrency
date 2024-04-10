package clearingDoubts.q1;

public class Main {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread());
		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.interrupt();
	}

}

class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			if (Thread.currentThread().isInterrupted()) {
				System.out.println("Thread was interrupted, stopping.");
				return;
			}
			System.out.println("hello " + i);
		}
	}
}