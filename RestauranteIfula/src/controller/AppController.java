package controller;

import model.Pedido;
import model.Produto;
import model.Restaurante;
import service.PedidoService;
import service.ProdutoService;
import service.RestauranteService;

import java.util.List;

public class AppController {
    private ProdutoService produtoService = new ProdutoService();
    private RestauranteService restauranteService = new RestauranteService();
    private PedidoService pedidoService = new PedidoService();

    public String adicionarProduto(int id, String nomeProduto, double valor) {
        Boolean sucesso = produtoService.adicionarProduto(id, nomeProduto, valor);
        if (sucesso) {
            return "Produto adicionado com sucesso";
        }
        return "Erro";

    }

    public String adicionarRestaurante(int id, String nomeRestaurante) {
        Boolean sucesso = restauranteService.adicionarRestaurante(id, nomeRestaurante);
        if (sucesso) {
            return "Restaurante adicionado";
        }
        return "Erro";
    }

    public String adicionarProdutoAoRestaurante(int idProduto, int idRestaurante) {
        Produto produto = produtoService.buscarProduto(idProduto);
        if (produto != null) {
            Boolean sucesso = restauranteService.adicionarProdutoAoRestaurante(produto, idRestaurante);
            if (sucesso) return "Produto adicionado ao restaurante";
        }
        return "Erro";
    }

    public String listarRestaurantes() {
        return restauranteService.listarRestaurantes();
    }

    public String listarProdutos() {
        return produtoService.listarProdutos();
    }

    public Produto buscarProduto(int id){
        return produtoService.buscarProduto(id);
    }

    public Restaurante buscarRestaurante(int id){
        return restauranteService.buscarRestaurante(id);
    }

    public Pedido buscarPedido(int numPedido){
        return pedidoService.buscarPedido(numPedido);
    }

    public String adicionarPedido(int numPedido, int idPedido, Restaurante restaurante, List<Produto> produtos){

        if (restaurante != null){
            Boolean sucesso = pedidoService.adicionarPedido(idPedido, restaurante, produtos);
            if (sucesso) return "Pedido realizado com sucesso";
        }
        return "Erro";
    }

}