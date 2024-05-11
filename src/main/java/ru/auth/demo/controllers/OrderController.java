package ru.auth.demo.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.auth.demo.dto.OrderDTO;
import ru.auth.demo.entities.Order;
import ru.auth.demo.services.OrderService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class OrderController {

    private OrderService orderService;

    @PostMapping("/addOrder")
    public ResponseEntity<Double> createOrder(@RequestBody OrderDTO orderDTO) {
        Order order = orderService.createOrder(orderDTO);
        return new ResponseEntity<>(order.getTotalPrice(), HttpStatus.CREATED);
    }

    @GetMapping("/allOrders")
    public ResponseEntity<List<Order>> getAllOrders() {
        List<Order> orders = orderService.findAllOrders();
        return ResponseEntity.ok(orders);
    }
}
