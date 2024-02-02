package company_Snippets;

public class Test_3_Interface {
	public static void main(String[] args) {
		Interface interface1 = (String value1, String value2) -> value1 + value2;
		System.out.println(interface1.concant("Benguluru", "Hyderabad"));
	}

	interface Interface {
		String concant(String value1, String value2);
	}
}
