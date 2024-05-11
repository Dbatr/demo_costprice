package ru.auth.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.auth.demo.entities.Material;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Long> {
}
