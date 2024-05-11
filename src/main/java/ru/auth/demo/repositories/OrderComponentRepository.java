package ru.auth.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.auth.demo.entities.OrderComponent;

@Repository
public interface OrderComponentRepository extends JpaRepository<OrderComponent, Long> {
}
