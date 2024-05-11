package ru.auth.demo.auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.auth.demo.auth.entities.RefreshToken;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Integer> {

    Optional<RefreshToken> findByRefreshToken(String refreshToken);
}
