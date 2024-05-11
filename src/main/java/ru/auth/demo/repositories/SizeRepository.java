package ru.auth.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.auth.demo.entities.Size;

@Repository
public interface SizeRepository extends JpaRepository<Size, Long> {

}
