package com.alura.gerenciador.gerenciador_pedidos.repository;

import com.alura.gerenciador.gerenciador_pedidos.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
