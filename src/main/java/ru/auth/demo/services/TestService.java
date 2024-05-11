package ru.auth.demo.services;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;
import ru.auth.demo.entities.TestEntity;
import ru.auth.demo.repositories.TestRepository;

@Service
@AllArgsConstructor
public class TestService {

    private final TestRepository testRepository;
    @Getter
    private final String abobba = "hihih";

    public void createName(TestEntity testEntity) {
        testRepository.save(testEntity);
    }
}
