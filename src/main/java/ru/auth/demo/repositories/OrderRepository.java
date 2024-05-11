package ru.auth.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.auth.demo.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
