package Work_13_07_23;

public class P2 {
	public static void main(String[] args) {
		int x = 10, y = 10;
		if ((++x * y--) == ((y++ * x++) + x - 1)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
} 

/*
1. Compile Time Error
2. false
3. Runtime Error
4. True 
*/