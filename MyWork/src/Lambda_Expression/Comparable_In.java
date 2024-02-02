package Lambda_Expression;

public class Comparable_In {
String name;
int age;
String gender;
public Comparable_In(String name, int age, String gender) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
}
@Override
public String toString() {
	return "Comparable_In [name=" + name + ", age=" + age + ", gender=" + gender + "]";
}
//@Override
//public int compareTo(Comparable_In obj) {
//	return this.age-obj.age;
//}

}
