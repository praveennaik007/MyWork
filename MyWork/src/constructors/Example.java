package constructors;

public class Example {
int a,b,c,d;
public Example(int a,int b,int c,int d) {
	this.a=a;
	this.b=b;
	this.c=c;
	this.d=d;
}
public Example(int a,int b,int c) {
	this (a,b,c,d);
}
}
