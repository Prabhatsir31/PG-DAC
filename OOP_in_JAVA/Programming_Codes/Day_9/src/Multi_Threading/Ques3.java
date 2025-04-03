/*
create 3 threads in such a way that while one thread is executing, 2 threads cannot interfere. 
they should display output "Exec  0" to "Exec 5".
*/
package Multi_Threading;

class SynchronizedThread implements Runnable {
    private String threadName;

    public SynchronizedThread(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            synchronized (this) {
                System.out.println(threadName + " - Exec " + i);
                try {
                    // Simulate some work with sleep
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(threadName + " interrupted: " + e.getMessage());
                }
            }
        }
    }
}

public class Ques3 {
    public static void main(String[] args) {
        // Create three threads
        Thread thread1 = new Thread(new SynchronizedThread("Thread 1"));
        Thread thread2 = new Thread(new SynchronizedThread("Thread 2"));
        Thread thread3 = new Thread(new SynchronizedThread("Thread 3"));

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("All threads have completed execution.");
    }
}