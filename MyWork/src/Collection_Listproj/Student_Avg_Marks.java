package Collection_Listproj;

public class Student_Avg_Marks {
int id;
String name;
double marks;
public Student_Avg_Marks(int id, String name, double marks) {
	super();
	this.id = id;
	this.name = name;
	this.marks = marks;
}
@Override
public String toString() {
	return "\nStudent_Avg_Marks [id=" + id + ", name=" + name + ", marks=" + marks + "]";
}
 
}
