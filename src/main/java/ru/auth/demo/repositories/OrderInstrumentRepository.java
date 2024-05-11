package ru.auth.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.auth.demo.entities.OrderInstrument;

@Repository
public interface OrderInstrumentRepository extends JpaRepository<OrderInstrument, Long> {
}
