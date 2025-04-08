package com.example.thread;

import java.util.LinkedList;
import java.util.Random;

public class Producer implements Runnable {
	private final LinkedList<Integer> buffer;
	Producer(LinkedList<Integer> buffer){
		this.buffer = buffer;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				this.produce();
		}catch(Exception e) {
			System.out.println(e);
		}
		}

}

public void produce() throws InterruptedException{
	synchronized(buffer) {
		while(buffer.size() == 5) {
			System.out.println("producer is waiting");
			buffer.wait();
		}
		Random r= new Random();
		int num = r.nextInt(100);
		System.out.println("Producer produced :"+num);
		buffer.add(num);
		buffer.notifyAll();
		Thread.sleep(10);
	}
}
}