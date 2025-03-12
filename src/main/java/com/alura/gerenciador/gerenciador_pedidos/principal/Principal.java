package com.alura.gerenciador.gerenciador_pedidos.principal;

import com.alura.gerenciador.gerenciador_pedidos.model.Categoria;
import com.alura.gerenciador.gerenciador_pedidos.model.Pedido;
import com.alura.gerenciador.gerenciador_pedidos.model.Produto;
import com.alura.gerenciador.gerenciador_pedidos.repository.CategoriaRepository;
import com.alura.gerenciador.gerenciador_pedidos.repository.PedidoRepository;
import com.alura.gerenciador.gerenciador_pedidos.repository.ProdutoRepository;
import org.hibernate.dialect.lock.OptimisticEntityLockException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class Principal {
    private Pedido pedido = new Pedido(LocalDate.now());
    private Produto produto1 = new Produto("Cubo Mágico", 69.90);
    private Produto produto2 = new Produto("Fone de Ouvido", 119.90);
    private Produto produto3 = new Produto("Microfone brabo", 280);
    private List<Produto> produtos = Arrays.asList(produto1, produto2, produto3);
    private Categoria categoria1 = new Categoria("Eletrônicos");
    private Categoria categoria2 = new Categoria("Brinquedos");
    private List<Categoria> categorias = Arrays.asList(categoria1, categoria2);

    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private CategoriaRepository categoriaRepository;

    public void Executar() {
        System.out.println("Salvando no banco de dados...");
        try {
            produtos.forEach(p -> produtoRepository.save(p));

            categorias
                    .forEach(c -> categoriaRepository.save(c));

            pedidoRepository.save(pedido);

            System.out.println("SUCESSO! Dados salvos no banco de dados.");

        } catch (IllegalArgumentException | OptimisticEntityLockException ex) {
            throw new IllegalArgumentException("ERRO! Falha ao salvar no banco de dados, erro: " + ex);
        }
    }
}
