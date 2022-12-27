package willydekeyser.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerAdvice {

	@ExceptionHandler(UnknownUsersException.class)
	public ProblemDetail handleUnknownUsersException(UnknownUsersException ex) {
		ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(
				HttpStatus.NOT_FOUND, 
				ex.getMessage());
		problemDetail.setProperty("User id", ex.getId());
		return problemDetail;
	}
	
	@ExceptionHandler(Exception.class)
	public ProblemDetail handleException(Exception ex) {
		ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(
				HttpStatus.NOT_FOUND, 
				ex.getMessage());
		return problemDetail;
	}
}
