package com.alura.gerenciador.gerenciador_pedidos;

import com.alura.gerenciador.gerenciador_pedidos.model.Pedido;
import com.alura.gerenciador.gerenciador_pedidos.principal.Principal;
import com.alura.gerenciador.gerenciador_pedidos.repository.CategoriaRepository;
import com.alura.gerenciador.gerenciador_pedidos.repository.PedidoRepository;
import com.alura.gerenciador.gerenciador_pedidos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GerenciadorPedidosApplication implements CommandLineRunner {
    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private Principal principal;

    public static void main(String[] args) {
        SpringApplication.run(GerenciadorPedidosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        principal.Executar();
    }
}
