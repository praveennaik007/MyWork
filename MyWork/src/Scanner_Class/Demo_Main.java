package Scanner_Class;

import java.util.Scanner;

public class Demo_Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
//		System.out.println("Enter the Size ");
//		int size = sc.nextInt();
//		Demo[] d = new Demo[size];
//		for (int i = 0; i < size; i++) {
//			System.out.println("Enter the properties of Demo " + (i + 1));
//			System.out.println("Enter the id ");
//			Integer id = sc.nextInt();
//			System.out.println("Enter the name ");
//			String name = sc.next();
//			d[i] = new Demo(id, name);
//			System.out.println((i + 1) + " Added Succesfully ");
//		}
//		for (Demo demo : d) {
//			System.out.println(demo);
//		}

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a=sc.nextInt();
		System.out.println(a);
		System.out.println("Enter the String : ");
//		String s=sc.next();
//		System.out.println(s);
		sc.nextLine();
		System.out.println("Enter the Sentance : ");
		String s1=sc.nextLine();
		System.out.println(s1);
	}
}
