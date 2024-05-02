package constructor_Overloading;

public class Student {
int id;
String name;
String branch;
double marks;
public Student(int id, String name, String branch, double marks) {
	super();
	this.id = id;
	this.name = name;
	this.branch = branch;
	this.marks = marks;
}
public Student(int id, String name) {
	this.id=id;
	this.name=name;
}
public void display() {
	System.out.println(this.id+" "+this.name+" "+this.branch+" "+this.marks);
}
}
