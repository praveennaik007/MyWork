package constructor_Overloading;

public class Flower {
String name;
String color;
int nOfPetels;

public Flower() {
	this.name="hibiscus";
	this.color="red";
	this.nOfPetels=8;
}
public Flower(String name, String color, int nOfPetels) {
	this.name = name;
	this.color = color;
	this.nOfPetels = nOfPetels;
}
public void display() {
	System.out.println(this.name);
	System.out.println(this.color);
	System.out.println(this.nOfPetels);
}
}
