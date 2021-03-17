package controller;

import model.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutoCont {
    public static class ProdutoController {


        List<Produto> produtos = new ArrayList();

        public String adicionarProduto(String prod, double valorProduto, int codigo) {
            try {
                Produto produto = new Produto();

                produto.setProd(prod);
                produto.setValorProduto(valorProduto);
                produto.setCodigo(codigo);

                produtos.add(produto);
                return "Produto Adicionado";
            } catch (Exception e) {
                e.printStackTrace();
                return "Erro";
            }
        }

        public String removerProduto(int codigo) {
            try {
                produtos.remove(buscarProduto(codigo));
                return "Produto Removido";
            } catch (Exception e) {
                e.printStackTrace();
                return "Erro";
            }
        }

        public Produto buscarProduto(int codigo) {
            for (int i = 0; i < produtos.size(); i++) {
                if (codigo == produtos.get(i).getCodigo()) {
                    return produtos.get(i);
                }
            }
            return null;
        }

        public String listarProdutos() {
            String print = "";
            for (int i = 0; i < produtos.size(); i++) {
                print += produtos.get(i).printarProduto();
            }
            return print;
        }

    }
}
