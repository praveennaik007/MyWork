package LambdaExpMethodReference;

public class SquareRootMain {
	public static void main(String[] args) {
		SquareRootMath sq = (n) -> Math.sqrt(25);
//		System.out.println(sq);
		SquareRootMath s = Math::sqrt;
		System.out.println(s.square(25));// 5.0
	}
}
