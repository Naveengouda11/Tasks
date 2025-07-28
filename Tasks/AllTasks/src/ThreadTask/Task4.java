package ThreadTask;

class Mythread1 extends Thread {
	public void run() {
		try {
			for(int i=3;i>0;i--) {
				System.out.println("Running Thread : " + i);
				Thread.sleep(1000);
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
public class Task4 {

	public static void main(String[] args) {
		Mythread1 t1= new Mythread1();
		
		System.out.println("Before Thread is : " + t1.isAlive());
		
		t1.start();
		
		System.out.println("After start Thread is : " + t1.isAlive());
		
		try {
			t1.join();
		}catch (Exception e) {
			System.out.println("Thread Interrupted");
		}
		
		System.out.println("After join : " + t1.isAlive());

	}

}
