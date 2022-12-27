package willydekeyser.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import willydekeyser.config.TodoClient;
import willydekeyser.model.Todo;

@RestController()
@RequiredArgsConstructor
public class TodoController {

	private final TodoClient todoClient;
	
	
	@GetMapping("/todo")
	public List<Todo> getTodos() {
		return todoClient.getTodos();
	}
	
	@GetMapping("/todo/{id}")
	public Todo getTodo(@PathVariable("id") Integer id) {
		return todoClient.getTodo(id);
	}
}
