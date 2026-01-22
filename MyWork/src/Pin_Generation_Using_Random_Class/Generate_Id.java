package Pin_Generation_Using_Random_Class;

import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class Generate_Id {
	int id;
	String name;
	double price;
	static Scanner sc = new Scanner(System.in);

	public Generate_Id(String name, double price) {
		Random r = new Random();
		this.id = r.nextInt(9999);
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Generate_Id [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		Generate_Id g1 = new Generate_Id("hi", 40);
		Generate_Id g2 = new Generate_Id("hello", 50);
		Generate_Id g3 = new Generate_Id("byee", 30);
		Generate_Id g4 = new Generate_Id("joy", 10);
		Generate_Id g5 = new Generate_Id("doll", 80);
		Generate_Id g6 = new Generate_Id("dog", 20);
		Generate_Id g7 = new Generate_Id("dom", 70);
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
		System.out.println(g4);
		System.out.println(g5);
		System.out.println(g6);
		System.out.println(g7);
//		Random r = new Random();
//		int a = r.nextInt(9999);
//		System.out.println(a);
		Queue<Integer> p = new PriorityQueue<Integer>();
		p.add(10);
		p.add(30);
		p.add(40);
		p.add(50);
		p.add(11);
		p.add(1);
		p.add(15);
		System.out.println(p);
	}
}
