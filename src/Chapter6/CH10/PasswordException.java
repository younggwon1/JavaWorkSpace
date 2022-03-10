package Chapter6.CH10;

/*
 * 사용자 정의 Exception
 */
public class PasswordException extends IllegalArgumentException{
	
	public PasswordException(String message) {
		super(message);
	}
}