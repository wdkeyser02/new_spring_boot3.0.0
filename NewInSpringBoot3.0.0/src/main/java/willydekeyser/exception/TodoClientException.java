package willydekeyser.exception;

public class TodoClientException extends Exception {

	private static final long serialVersionUID = 1L;

	public TodoClientException(Integer id) {
		super("The Todo is not found");
	}
}
