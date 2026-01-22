package Thread_Ex;

public class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
//		t1.start();
//		t2.start();
//		t3.start();
//		for (int i = 1; i <= 10; i++) {
//			System.out.println("hi");
//		}
//		System.out.println(t1.getId());
//		System.out.println(t2.getId());
//		System.out.println(t1.getName());
//		System.out.println(t2.getName());
//		t1.setName("Hello");
//		System.out.println(t1.isAlive());
//		System.out.println(t1);
//		System.out.println(t2);
//		System.out.println(t2.currentThread());
//		System.out.println(t1.getPriority());
//		t1.setPriority(MAX_PRIORITY);
//		System.out.println(t1);		
//		t1.setPriority(MIN_PRIORITY);
//		System.out.println(t1);		
//		t1.setPriority(NORM_PRIORITY);
//		System.out.println(t1);	
		
//		System.out.println(t1.getState());
//		t1.suspend();
//		t1.resume();
//		System.out.println(t1);
//	t1.yield();
//	t1.start();
//	t2.start();
//	t3.start();
//	t1.start();
	t1.sleep(1000);
	t1.start();


	}
}
