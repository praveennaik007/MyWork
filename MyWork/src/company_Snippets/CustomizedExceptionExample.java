package company_Snippets;

public class CustomizedExceptionExample {
	public static void main(String[] args) {
		CustomizedExceptionExample obj=new CustomizedExceptionExample();
		try {
			obj.validateCustomer("id");
		} catch (InvalidCustomerException e) {
			System.out.println("InvalidCustomerException");
			System.out.println(e.getMessage());
		}
	}

	public static void validateCustomer(String customerId) {
		if ("id".equals(customerId)) {
			throw new InvalidCustomerException("Invalid Customer");
		}
	}
}
	
class InvalidCustomerException extends RuntimeException {
	public InvalidCustomerException(String s) {
		super(s);
	}

}