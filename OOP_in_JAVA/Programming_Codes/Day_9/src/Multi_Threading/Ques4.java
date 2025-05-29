/*
create 2 threads. Write a program which displays number 1 to 10 using class lock. 
[hint:- use "implements Runnable" and synchronized block]
*/
package Multi_Threading;

class NumberPrinter implements Runnable {
    private static int number = 1;
    private final int threadId;

    public NumberPrinter(int id) {
        this.threadId = id;
    }

    @Override
    public void run() {
        while (number <= 10) {
            synchronized (this) {
                if (number <= 10) {
                    System.out.println("Thread " + threadId + ": " + number);
                    number++;
                    try {
                        // Simulate some work with sleep
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        System.out.println("Thread " + threadId + " interrupted: " + e.getMessage());
                    }
                }
            }
        }
    }
}

public class Ques4 {
    public static void main(String[] args) {
        // Create two threads
        Thread thread1 = new Thread(new NumberPrinter(1));
        Thread thread2 = new Thread(new NumberPrinter(2));

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("All numbers have been printed.");
    }
}