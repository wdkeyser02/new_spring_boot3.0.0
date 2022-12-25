package willydekeyser.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import willydekeyser.exception.UnknownUsersException;
import willydekeyser.model.Users;
import willydekeyser.service.UsersService;

@RestController
@RequiredArgsConstructor
public class UsersController {

	private final UsersService usersService;
	
	@GetMapping("/")
	public String welcome() {
		return "Welcome";
	}
	
	@GetMapping("/users")
	public List<Users> getusers() {
		return usersService.getUsers();
	}
	
	@GetMapping("/users/{id}")
	public Users getUserById(@PathVariable Integer id) throws Exception {
		return usersService.getUserById(id).orElseThrow(() -> new UnknownUsersException(id));
	}
	
}
