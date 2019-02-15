package com.training.day4.threads;

class DB{}

class MyDB extends DB implements Runnable{

	Thread thread; 
	
	public MyDB() {}
	public MyDB(String threadName, int priority) {
		thread  = new Thread(this, threadName);
		thread.setPriority(priority);
		thread.start(); 
	}
	
	
	@Override
	public void run() {
		for(int i=0; i <300; i++) {
			System.out.println("i value " + i +", in " + Thread.currentThread().getName()
					+", with priority " + Thread.currentThread().getPriority());
		}
		System.out.println("Thread " + Thread.currentThread().getName() +" exting");
	}
}

public class ThreadEx02 {
	public static void main(String[] args) {
		MyDB md1 = new MyDB("MySQL", 5);
		MyDB md2 = new MyDB("Oracle", 7);
		MyDB md3 = new MyDB("DB2", 8);
		

		Thread t1 = new Thread(new MyDB());
		t1.setName("Postgress");
		t1.start();
		
		
	}
}
