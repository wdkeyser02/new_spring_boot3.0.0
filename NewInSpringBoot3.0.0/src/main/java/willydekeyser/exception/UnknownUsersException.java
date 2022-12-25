package willydekeyser.exception;

public class UnknownUsersException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private Integer id;
	
	public UnknownUsersException(Integer id) {
		super("The User with Id: '" + id + "' is unknown");
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}

}
