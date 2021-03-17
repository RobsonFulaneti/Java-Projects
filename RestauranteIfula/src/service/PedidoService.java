package service;

import model.Pedido;
import model.Produto;
import model.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class PedidoService {

    List<Pedido> pedidos = new ArrayList<>();

    public Boolean adicionarPedido(int numPedido, Restaurante restaurante, List<Produto> produtos) {
        try {

            Pedido pedido = new Pedido();

            pedido.setNumPedido(numPedido);
            pedido.setRestaurante(restaurante);
            pedido.setProdutos(produtos);

            pedidos.add(pedido);
            System.out.println(pedidos.toString());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Pedido buscarPedido(int numPedido) {
        for (Pedido pedido : pedidos)
            if (numPedido == pedido.getNumPedido()) return pedido;
        return null;
    }
}