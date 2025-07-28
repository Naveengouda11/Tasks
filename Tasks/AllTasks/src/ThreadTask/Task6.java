package ThreadTask;

class Counter {
	int count =0;
	
	public void increment() {
		count++;
	}
}

class MyThread4 extends Thread {
	Counter counter;
	
	MyThread4(Counter counter) {
		this.counter = counter;
	}
	
	public void run() {
		for(int i=0;i<1000;i++) {
			counter.increment();
		}
	}
	
}

public class Task6 {

	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		
		MyThread4 t1 = new MyThread4(counter);
		MyThread4 t2 = new MyThread4(counter);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Final count : " + counter.count);
		
		

	}

}
