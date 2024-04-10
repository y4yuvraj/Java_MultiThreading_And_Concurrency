package multiThreadingConcepts;

import java.math.BigInteger;

public class LongComputationTask implements Runnable {

	private BigInteger base;
	private BigInteger power;

	public LongComputationTask(BigInteger base, BigInteger power) {
		super();
		this.base = base;
		this.power = power;
	}

	@Override
	public void run() {
		BigInteger res = pow(base, power);
		System.out.println(res);
	}

	public BigInteger pow(BigInteger base, BigInteger power) {
		BigInteger result = BigInteger.ONE;
		for (BigInteger i = BigInteger.ZERO; i.compareTo(power) != 0; i=i.add(BigInteger.ONE)) {
//			System.out.println(i);
			result = result.multiply(base);
		}
		return result;
	}

}
