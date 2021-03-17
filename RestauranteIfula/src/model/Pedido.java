package model;

import java.util.List;

public class Pedido {
    private int numPedido;
    private Restaurante restaurante;
    private List<Produto> produtos;

    @Override
    public String toString() {
        return "Pedido{" +
                "numPedido=" + numPedido +
                ", restaurante=" + restaurante +
                ", produtos=" + produtos +
                '}';
    }



    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
