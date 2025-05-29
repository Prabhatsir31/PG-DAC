/*
define a class "Display" with "void disp" method. inside this method display values from 1 to 10.
create an implementation of "Runnable" using lambda expression which will invoke "disp()" method 
of "Display" class.
create 2 threads and pass above created "Runnable" implementation to these threads.
make sure while one thread is executing other thread will not interfere.
*/

package Lambda;

class Display {
    public synchronized void disp() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - Value: " + i);
            try {
                Thread.sleep(100); // Sleep for a short duration to simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Ques5 {
    public static void main(String[] args) {
        Display display = new Display();
        Runnable runnable = () -> display.disp(); // Lambda expression for Runnable
        Thread thread1 = new Thread(runnable, "Thread 1");
        Thread thread2 = new Thread(runnable, "Thread 2");

        thread1.start();
        thread2.start();
    }
}