package com.training.day4.threads;

// every class in the java is a thread class 

class BusinessLogic extends Thread{
	
	@Override
	public void run() {
		// kill some time 
		for(int i=0; i<700; i++) {
			System.out.println("i value in " + Thread.currentThread().getName() +", is " + i);
		
		
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		
		}
		System.out.println(Thread.currentThread().getName() +" is exiting");
	}
}



public class ThreadEx01 {
	public static void main(String[] args) {
		System.out.println("Main Method Thread Name: " +Thread.currentThread().getName());
		// by default 5 is the priority 
		// max is 10 
		// min is 1 
		System.out.println("Main Priority "+Thread.currentThread().getPriority());
		
		BusinessLogic bl = new BusinessLogic(); // Thread t = new Thread(); 
		bl.setName("First");
		bl.setPriority(Thread.MIN_PRIORITY);
		bl.start(); // the thread is invoked from JVM, different name 
		
		BusinessLogic bl2 = new BusinessLogic();
		bl2.setPriority(Thread.NORM_PRIORITY);
		bl2.setName("Second");
		bl2.start(); 
		
		BusinessLogic bl3 = new BusinessLogic();
		bl3.setPriority(Thread.MAX_PRIORITY);
		bl3.setName("Thrid");
		bl3.start();
		
		try {
			bl.join();
			bl2.join();
			bl3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		
		
		System.out.println("Main Method is exiting... ");
		
		
	}
}
