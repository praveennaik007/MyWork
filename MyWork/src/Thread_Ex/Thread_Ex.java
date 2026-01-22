package Thread_Ex;

public class Thread_Ex implements Runnable {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("run()");
		}
	}

	public static void main(String[] args) {
		Thread_Ex t1 = new Thread_Ex();
		Thread_Ex t3 = new Thread_Ex();
		Thread t = new Thread(t1);
		Thread t4 = new Thread(t1);
		t.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println("Main");
		}
		t4.start();
		
	}

}
