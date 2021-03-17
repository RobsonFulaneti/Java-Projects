package service;

import model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoService {

    private List<Produto> produtos = new ArrayList();

    public Boolean adicionarProduto(int id, String nomeProduto, double valor) {
        try {
            Produto produto = new Produto();

            produto.setId(id);
            produto.setNome(nomeProduto);
            produto.setValor(valor);

            produtos.add(produto);
            System.out.println(produtos.toString());

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Produto buscarProduto(int id) {
        for (Produto produto : produtos) {
            if (id == produto.getId()) return produto;
        }
        return null;
    }

    public String listarProdutos(){
        String produtosOutput = "";
        for (Produto produto : produtos) {
            produtosOutput += produto.getId() + " - " + produto.getNome() + "\n";
        }
        return produtosOutput;
    }
}
