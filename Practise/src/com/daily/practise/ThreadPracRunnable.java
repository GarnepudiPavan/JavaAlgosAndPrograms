package com.daily.practise;

public class ThreadPracRunnable extends Thread {

	public void run() {
		System.out.println("OuterClass Thread running is started:"+" "+Thread.currentThread().getId());
	//	for(int i=1; i<11;i++)
		System.out.println("outerClass Thread running is:"+" "+Thread.currentThread().getId());
	}
	
	public class subclass implements Runnable{
		
		public void run() {
			System.out.println("InnerClass Thread running is started:"+" "+Thread.currentThread().getId());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Thread running is started:"+" "+Thread.currentThread().getId());
		ThreadPracRunnable obj1 = new ThreadPracRunnable();
		Runnable subClassObj = obj1.new subclass();
		Thread newThread = new Thread(subClassObj);
		obj1.start();
		newThread.start();
		Thread.yield();
		System.out.println("InnerClass Thread status is :"+" "+newThread.getState());
		System.out.println("Outer Class Thread status is :"+" "+obj1.getState());
		System.out.println("Main Thread status is :"+" "+Thread.currentThread().getState());
	}

}
