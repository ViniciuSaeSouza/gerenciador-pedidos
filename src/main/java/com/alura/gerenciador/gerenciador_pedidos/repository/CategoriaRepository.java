package com.alura.gerenciador.gerenciador_pedidos.repository;

import com.alura.gerenciador.gerenciador_pedidos.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
