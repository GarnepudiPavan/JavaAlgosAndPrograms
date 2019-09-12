package com.daily.practise;

import java.util.concurrent.TimeUnit;

public class CreateThread implements Runnable {
	private volatile boolean exit = false;
	private Thread t;
	String threadName;

	public CreateThread(String threadName) {

		this.threadName = threadName;
	}

	public void run() {
		System.out.println("Running thread" + " " + this.threadName);
		while (!exit) {
			for (int i = 0; i < 6; i++) {
				System.out.println("running newly created thread. It's ID is" + " " + t.getId() + " " + "ThreadCount is"
						+ " " + i);
				System.out.println("Priority and state of thread are" + " " + t.getPriority() + " " + t.getState());
			}
			try {
				Thread.sleep(3000);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void startThread() {
		System.out.println("Starting new thread");
		t = new Thread(this);
		t.start();
		/*
		 * try { TimeUnit.MILLISECONDS.sleep(200); } catch (InterruptedException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); }
		 */
	}

	public void stopThread() {
		System.out.println("Waiting for thread to stop..");
		exit = true;
		if (t.isAlive()) {
			System.out.println("Thread" + " " + t.getId() + " " + "is still" + " " + t.getState() + " "
					+ "waiting for it to join");
			// t.stop();

			try {
				TimeUnit.MILLISECONDS.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(
					"Thread " + " " + t.getId() + " " + "status after calling stop" + " " + "is" + " " + t.getState());
		} else {
			System.out.println("Thread" + " " + t.getName() + " " + t.getState());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateThread threadObject = new CreateThread("FirstThread");
		threadObject.startThread();
		 System.out.println(Thread.currentThread().getName() + " is stopping Server thread");
		 
		threadObject.stopThread();
		 //Let's wait to see server thread stopped 
        try {
			TimeUnit.MILLISECONDS.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println(Thread.currentThread().getName() + " is finished now");

	}

}
