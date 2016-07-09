package com.myc.sample.threads;

public class ProducerConsumerProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Util obj = new Util();
		Producer p = new Producer(obj);
		Consumer c = new Consumer(obj);
		
		p.start();
		c.start();
	}

}
