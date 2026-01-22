package company_Snippets;

public class Test_4 {
public static void main(String[] args) {
	String returnVal=method1();
	System.out.println(returnVal);
}

public static String method1() {
	
	try {
		int i=100/0;
		System.out.println(i);
	}catch (Exception e) {
		System.out.println("Exception Caught");
		return "From catch";
	}
	finally {
		System.out.println("Finnally block executing");
		
	}
	System.out.println("end");
	return "From End";
}
}
