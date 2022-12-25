package willydekeyser.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import willydekeyser.model.Users;
import willydekeyser.repository.UsersRepository;

@Service
@RequiredArgsConstructor
public class UsersService {
	
	private final UsersRepository usersRepository;
	
	public List<Users> getUsers() {
		return usersRepository.findAll();
	}

	public Optional<Users> getUserById(Integer id) {
		return usersRepository.findById(id);
		
	}
}
