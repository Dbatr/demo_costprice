package ru.auth.demo.entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "materials")
@Data
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type")
    private String type;

    @Column(name = "price")
    private Double price;

}
