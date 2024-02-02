package Abstraction;

public class P2 extends P1 {
	int j;
	public P2(int i,int j) {
		super(i);
		this.j=j;
	}
	public void run() {
		System.out.println("from p2...!");
	}
}
