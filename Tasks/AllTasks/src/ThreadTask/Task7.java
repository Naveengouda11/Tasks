package ThreadTask;

class Counter1 {
	int count =0;
	
	public synchronized void increment() {
		count++;
	}
}

class MyThread5 extends Thread {
	Counter1 counter;
	
	MyThread5(Counter1 counter) {
		this.counter = counter;
	}
	
	public void run() {
		for(int i=0;i<1000;i++) {
			counter.increment();
		}
	}
	
}

public class Task7 {

	public static void main(String[] args) throws InterruptedException {
		Counter1 counter = new Counter1();
		
		MyThread5 t1 = new MyThread5(counter);
		MyThread5 t2 = new MyThread5(counter);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Final count : " + counter.count);
		
		

	}

}

