package handlingUncheckedExceptionInThread;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside Thread "+Thread.currentThread().getName());
				throw new RuntimeException("custom throwned exception");
			}
		});
		
		t1.setName("thread1");
		t1.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				// TODO Auto-generated method stub
				System.out.println("critical error occured in thread : "+t.getName() 
				+" the error is : "+e.getMessage());
			}
		});
		t1.start();
		
		Thread.sleep(1000);
	}
	
}
