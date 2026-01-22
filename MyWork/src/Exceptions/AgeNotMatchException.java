package Exceptions;

public class AgeNotMatchException extends RuntimeException {
	public AgeNotMatchException(String str) {
		super(str);
	}
}
