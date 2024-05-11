package ru.auth.demo.entities;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "sizes")
@Data
public class Size {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sizeId;

    @Column(name = "width")
    private Double width;

    @Column(name = "length")
    private Double length;

    @Column(name = "price")
    private Double price;

}
