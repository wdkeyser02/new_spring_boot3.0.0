package willydekeyser.exception;

public class TodoClientException extends Exception {

	private static final long serialVersionUID = 1L;
	private Integer id;
	
	public TodoClientException(Integer id) {
		super("The Todo with Id: '" + id + "' is not found");
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
}
