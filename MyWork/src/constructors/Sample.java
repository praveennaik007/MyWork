package constructors;

public class Sample {
	int i;
	int j;
	public Sample(int iValue, int jValue, int kValue) {
		
		System.out.println(this);
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(this.i=i);
		this.i = iValue;
		this.j = jValue;
		System.out.println(kValue);
	}
	public  void m1() {
		System.out.println("hello World");
	}
	public void dis() {
		this.m1();
		System.out.println(this.i);
		System.out.println(this.j);

	}
}
