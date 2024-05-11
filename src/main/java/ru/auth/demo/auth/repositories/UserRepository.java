package ru.auth.demo.auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.auth.demo.auth.entities.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String username);

}
