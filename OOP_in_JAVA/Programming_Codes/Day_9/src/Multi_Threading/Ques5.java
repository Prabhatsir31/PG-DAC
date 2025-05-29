/*
create 2 threads
	one thread will display 1 to 50
	second thread will display 50 to 1
both the threads should start simultaneously.

(use implements method)
*/
package Multi_Threading;

class AscendingThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("Ascending: " + i);
            try {
                Thread.sleep(50); // Sleep for a short duration to simulate work
            } catch (InterruptedException e) {
                System.out.println("Ascending thread interrupted: " + e.getMessage());
            }
        }
    }
}

class DescendingThread implements Runnable {
    @Override
    public void run() {
        for (int i = 50; i >= 1; i--) {
            System.out.println("Descending: " + i);
            try {
                Thread.sleep(50); // Sleep for a short duration to simulate work
            } catch (InterruptedException e) {
                System.out.println("Descending thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class Ques5 {
    public static void main(String[] args) {
        // Create two threads
        Thread ascendingThread = new Thread(new AscendingThread());
        Thread descendingThread = new Thread(new DescendingThread());

        // Start both threads
        ascendingThread.start();
        descendingThread.start();

        // Wait for both threads to finish
        try {
            ascendingThread.join();
            descendingThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("Both threads have completed execution.");
    }
}