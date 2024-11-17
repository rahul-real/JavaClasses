/**
 * 
 */
package com.java.classes;

/**
 * @author rahul
   @since  22-Feb-2024 2024 11:30:37 am
 */
public class MultiThreadExample extends Thread {
	
	/**
	 * @param i
	 */
	private int threadNumber;
	public MultiThreadExample(int threadNumber) {
		this.threadNumber = threadNumber;
	}

	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(i + " From Thread" + threadNumber);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

}
