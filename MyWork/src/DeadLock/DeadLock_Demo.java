package DeadLock;

public class DeadLock_Demo {
// 	when two or more threads waiting for each other 
//	infinitely to release the resources in
//	this case we completely stuck and cannot proceed with their own tasks.
//	Neither they can release the resources which they are holding.

//	when two threads are waiting for each other forever such type of infinite waiting is called DeadLock
//	By using synchronized keyword we are going to get deadLock situation 
//	synchronized keyword is the only reason for deadlock situation because if there is no specific requirement then never recommended to use synchronized keyword  
//	it is a dangerous keyword. while using synchronized keyword we have to take a bit care 
//	there is resolution techniques for deadlock but several prevention technique are available  
//// synchronized keyword is the only reason for deadlock situation.
//// Hence while using synchronized keyword we have to take special care. 
//// There are no resolution techniques for deadlock but several prevention techniques are available. 
//	public class A {
//		public synchronized void deadLock1(B b) {
//			System.out.println("Starts Execution of deadlock1()");
//			try {
//				Thread.sleep(1000);
//
//			} catch (InterruptedException e) {}
//				System.out.println("thread trying to call bs last method");
//			b.last();
//		}
//
//		public synchronized void last() {
//			System.out.println("inside A, last method ");
//		}
//
//	}
//
//	class B {
//		public synchronized void deadlock2(A a) {
//			System.out.println("Starts Execution of deadlock2()");
//			try {
//				Thread.sleep(1000);
//
//			} catch (InterruptedException e) {}
//				System.out.println("thread trying to call As last method");
//			a.last();
//		}
//
//		public synchronized void last() {
//			System.out.println("inside B, last method ");
//		}
//	}
//
//	class C extends Thread {
//		A a = new A();
//		B b = new B();
//		public void m1() {
//			this.start();
//			a.deadLock1(b);
//		}
//		public void run() {
//			b.deadlock2(a);
//		}
//		public static void main(String[] argument) {
//			C c=new C();
//			c.m1();;
//
//		}
//	}
//	in the above program if we remove atleast one synchronized keyword then the program wont entered into deadlock heance synchronized keyword is the only reason for deadlock situation due to this while using synchronized we have to take special care. 
// deadlock vs sarvation
//	
}
