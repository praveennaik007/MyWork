package weCanInheritStaticMembers;

public class A_B_User {
	public static void main(String[] args) {
		System.out.println(B.a);
		B.jump();

		System.out.println(A.a);
		A.jump();
	}
}
