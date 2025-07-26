package ThreadTask;

class RunnableCounter implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
	}
}

public class Task2 {

	public static void main(String[] args) {
	 RunnableCounter r1 = new RunnableCounter();
	 r1.run();

	}

}
