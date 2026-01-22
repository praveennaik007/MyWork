package Thread_Ex;

public class Sync {
public synchronized void sync(int n) {
	for(int i=1;i<=10;i++) {
		System.out.println(n++);
	}
}
}
