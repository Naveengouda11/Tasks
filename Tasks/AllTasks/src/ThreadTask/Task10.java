package ThreadTask;

class Chat {
    boolean turn = true; 
    synchronized void sender(String msg) {
        while (!turn) {
            try {
                wait();
            } catch (Exception e) {}
        }
        System.out.println("Sender: " + msg);
        turn = false;
        notify();
    }

    synchronized void receiver(String msg) {
        while (turn) {
            try {
                wait();
            } catch (Exception e) {}
        }
        System.out.println("Receiver: " + msg);
        turn = true;
        notify();
    }
}

public class Task10 {

    public static void main(String[] args) {
        Chat ch = new Chat();

        String[] senderMsgs = { "Hi!", "How are you?" };
        String[] receiverMsgs = { "Hello!", "I’m fine." };

        Thread t1 = new Thread(() -> {
            for (String msg : senderMsgs) {
                ch.sender(msg);
            }
        });

        Thread t2 = new Thread(() -> {
            for (String msg : receiverMsgs) {
                ch.receiver(msg);
            }
        });

        t1.start();
        t2.start();
    }
}
