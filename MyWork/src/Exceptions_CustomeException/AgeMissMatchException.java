package Exceptions_CustomeException;

public class AgeMissMatchException extends RuntimeException {
	
	public AgeMissMatchException(String str) {
		super(str);
	}
}
