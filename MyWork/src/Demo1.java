
public class Demo1 extends Demo{
int j;

public Demo1(int i, int j) {
	super(i);
	super.i=i;
	this.j = j;
}
public void display() {
	System.out.println(this.j);
	System.out.println(super.i);
}
public static void main(String[] args) {
	Demo1 d=new Demo1(10, 20);
	d.display();
}
}
