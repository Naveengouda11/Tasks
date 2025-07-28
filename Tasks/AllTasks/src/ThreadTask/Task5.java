package ThreadTask;

class newthread extends Thread {
	public void run() {
		try {
			System.out.println(Thread.currentThread() + " Running Thread " + getName());
		}catch (Exception e) {
			System.out.println("Thread Interrupted");
		}
	}
}
public class Task5 {

	public static void main(String[] args) {
		newthread t1 = new newthread();
		newthread t2 = new newthread();
		newthread t3 = new newthread();
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("Thread t1 : " + t1.getPriority());
		System.out.println("Thread t2 : " + t2.getPriority());
		System.out.println("Thread t3 : " + t3.getPriority());
		
		

	}

}
