package com.klu.security;

import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.klu.model.Role;
import com.klu.model.User;
import com.klu.repository.UserRepository;

//@Configuration
@Configuration
public class DataLoader {

	@Bean
	public CommandLineRunner loadData(UserRepository userRepository,PasswordEncoder passwordEncoder) {
		return args->{
			Role adminRole = new Role();
			adminRole.setName("ROLE_ADMIN");
			
			User admin = new User();
			admin.setUsername("admin");
			admin.setPassword(passwordEncoder.encode("admin"));
			admin.setRoles(Set.of(adminRole));
			
			
			Role userRole = new Role();
			userRole.setName("ROLE_USER");
			
			User user = new User();
			user.setUsername("user");
			user.setPassword(passwordEncoder.encode("user"));
			user.setRoles(Set.of(userRole));
			
			userRepository.save(admin);
			userRepository.save(user);
			
		};
	}
}
