package multiThreadingConcepts;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new LongComputationTask(new BigInteger("4"),new BigInteger("200000")));
		t1.start();
		
		System.out.println("main thread ended but until the Thread t1 does not finsih app will continue to run");
	}

}
