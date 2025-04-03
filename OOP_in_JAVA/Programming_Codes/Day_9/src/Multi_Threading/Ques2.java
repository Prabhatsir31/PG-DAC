/*
2) above program  using "implements Runnable" method.
*/
package Multi_Threading;

class Ques2 implements Runnable  {
	synchronized public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Hello" + i);
		}
	}
	
	public static void main(String[] args) {
		Ques2 ob = new Ques2();
		Thread t1 = new Thread(ob);
		Thread t2 = new Thread(ob);
		t1.start();
		t2.start();
    }
}