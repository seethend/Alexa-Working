package net.fiol.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.fiol.demo.models.User;

import java.lang.String;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	List<User> findByName(String name);
	
}
