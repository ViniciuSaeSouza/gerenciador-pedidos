package com.alura.gerenciador.gerenciador_pedidos.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate data;

    // Construtores

    public Pedido() {
    }

    public Pedido(LocalDate data) {
        this.data = data;
    }

    // Getters e Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}

