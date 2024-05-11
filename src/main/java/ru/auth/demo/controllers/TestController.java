package ru.auth.demo.controllers;

import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import ru.auth.demo.entities.TestEntity;
import ru.auth.demo.services.TestService;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class TestController {

    private TestService testService;

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/name")
    public String getName() {
        return "TestController with admin role is work fine";
    }

    @GetMapping("/aboba")
    public String getAboba() {
        return testService.getAbobba();
    }

    @PostMapping("/addName")
    public String createName(@RequestBody TestEntity testEntity) {
        testService.createName(testEntity);
        return "Name added";
    }
}
