package ThreadTask;

class MyPrinterThread extends Thread {
	
	public void run() {
		try {
		for(int i=0;i<5;i++) {
			System.out.println("Hello from Thread");
			Thread.sleep(1000);
			
		}
	}catch(Exception ex) {
		System.out.println(ex.getMessage());
	}
	}

		
	
}

public class Task1 {

	public static void main(String[] args) {
		MyPrinterThread m1 = new MyPrinterThread();
		m1.start();
		
	}

}
