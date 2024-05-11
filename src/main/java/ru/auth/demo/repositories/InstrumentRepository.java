package ru.auth.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.auth.demo.entities.Instrument;

@Repository
public interface InstrumentRepository extends JpaRepository<Instrument, Long> {
}
