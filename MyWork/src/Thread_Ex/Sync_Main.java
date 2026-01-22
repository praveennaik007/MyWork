package Thread_Ex;

public class Sync_Main {
public static void main(String[] args) {
		Sync sc = new Sync();
	Runnable r1=()->{
		sc.sync(11);
	};
	Runnable r2=()->sc.sync(111);
	Thread t=new Thread(r1);
	Thread t1=new Thread(r2);
	t.start();
	t1.start();
}
}
