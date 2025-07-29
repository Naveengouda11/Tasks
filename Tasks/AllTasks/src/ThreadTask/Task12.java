package ThreadTask;

public class Task12 extends Thread{
	
	public void run() {
		try {
			for(int i=10;i>=1;i--) {
				System.out.println("Thread running : " + i);
				Thread.sleep(1000);
			}
		}catch (Exception e) {
			
		}
		System.out.println("Time's up");
	}
	

	public static void main(String[] args) {
	Task12 t1 = new Task12();
	t1.start();

	}

}
