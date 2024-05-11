package ru.auth.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.auth.demo.entities.TestEntity;

public interface TestRepository extends JpaRepository<TestEntity, Long> {
}
