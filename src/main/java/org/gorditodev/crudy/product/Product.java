package org.gorditodev.crudy.product;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;

@Getter @Setter
@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(unique = true)
    private String name;
    private double price;
    private LocalDate fecha;
    private int antiguedad;

    public Product() {
    }

    public Product(Long id, String name, double price, LocalDate fecha) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.fecha = fecha;

    }

    public Product(String name, double price, LocalDate fecha) {
        this.name = name;
        this.price = price;
        this.fecha = fecha;

    }
    
}
