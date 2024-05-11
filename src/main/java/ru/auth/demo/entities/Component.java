package ru.auth.demo.entities;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "components")
@Data
public class Component {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type")
    private String type;


    @Column(name = "price")
    private Double price;

    // Геттеры и сеттеры
}
