package ThreadTask;

import java.nio.channels.AsynchronousFileChannel;

class Buffer {
	private int data;
	private boolean avl = false;
	
	synchronized void producer(int val) {
		while(avl) {
			try {
				wait();
			}catch(InterruptedException ex) {
				
			}
		}
			
			data = val;
			System.out.println("Produced: " + data);
			avl = true;
			notify();
		}
		synchronized void consumer() {
			while(!avl) {
				try {
					wait();
				}catch (InterruptedException e) {
					
				}
			}
				System.out.println("Consumed : " + data);
				avl = false;
				notify();
				
			}
}

public class Task9 {

	public static void main(String[] args) {
		Buffer b = new Buffer();
		
		Thread prod = new Thread(() -> {
			for(int i=1;i<6;i++) {
				b.producer(i);
				}
		});
		Thread cus = new Thread(() -> {
			for(int i=1;i<6;i++) {
				b.consumer();
			}
		});
		prod.start(); 
		cus.start();

	}

}
