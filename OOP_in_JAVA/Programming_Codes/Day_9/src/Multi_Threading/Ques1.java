/*
 create a multi-threaded application by using  "extends Thread " method.create 2 threads. they should
 display characters from A to J.

 */

package Multi_Threading;

class CharacterThread extends Thread {
    private char startChar;
    private char endChar;

    public CharacterThread(char startChar, char endChar) {
        this.startChar = startChar;
        this.endChar = endChar;
    }

    @Override
    public void run() {
        for (char ch = startChar; ch <= endChar; ch++) {
            System.out.print(ch + " ");
            try {
                // Sleep for a short duration to simulate work and allow context switching
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class Ques1 {
    public static void main(String[] args) {
        // Create two threads to display characters
        CharacterThread thread1 = new CharacterThread('A', 'E'); // Thread for A to E
        CharacterThread thread2 = new CharacterThread('F', 'J'); // Thread for F to J

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

        System.out.println("\nAll characters displayed.");
    }
}