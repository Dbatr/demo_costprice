package ru.auth.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.auth.demo.entities.Component;

@Repository
public interface ComponentRepository extends JpaRepository<Component, Long> {

}