package prob5;

public class MyStackException extends Exception {
	private static final long serialVersionUID = 1L;

	public MyStackException() {
		super( "Stack is Empty" );
	}
	
	public MyStackException( String message ) {
		super( message );
	}
}
