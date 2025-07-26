package ThreadTask;

class Mythread extends Thread {
    public void run() {
        try {
            for(int i = 1; i <= 5; i++) {
                System.out.println("Thread-1 : " + i);
                Thread.sleep(1000); 
            }
        } catch(InterruptedException ex) {
            System.out.println("Thread interrupted: " + ex.getMessage());
        }
    }
}

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        Mythread t1 = new Mythread();
        t1.start();
        t1.join();
        System.out.println("Main thread done.");
    }
}

