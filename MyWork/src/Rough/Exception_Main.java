package Rough;

public class Exception_Main {
public static void main(String[] args) {
	Exception2_Ex e=(Exception2_Ex)new Exception1_Ex();
		System.out.println(e.i);//ClassCastException
}
}
