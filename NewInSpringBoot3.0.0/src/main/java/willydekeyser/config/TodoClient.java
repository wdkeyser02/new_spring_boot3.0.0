package willydekeyser.config;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import willydekeyser.model.Todo;

@HttpExchange("https://jsonplaceholder.typicode.com")
public interface TodoClient {

	@GetExchange("/todos")
	List<Todo> getTodos();
	
	@GetExchange("/todos/{id}")
	Todo getTodo(@PathVariable("id") Integer id);
}
