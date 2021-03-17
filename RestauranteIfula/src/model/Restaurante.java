package model;

import java.util.List;

public class Restaurante {
    private int id;
    private String nome;

    private List<Produto> produtos;

    @Override
    public String toString() {
        return "Restaurante{" +
                "id=" + id +
                ", nomeRestaurante='" + nome + '\'' +
                ", produtos=" + produtos +
                '}';
    }

    public String listarProdutos(){
        String produtosOutput = "";
        for (Produto produto : produtos) {
            produtosOutput += produto.getId() + " - " + produto.getNome() + "\n";
        }
        return produtosOutput;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
