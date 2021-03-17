package service;

import model.Produto;
import model.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class RestauranteService {

    private List<Restaurante> restaurantes = new ArrayList<>();

    public Boolean adicionarRestaurante(int id, String nomeRestaurante) {
        try {
            Restaurante restaurante = new Restaurante();

            restaurante.setNome(nomeRestaurante);
            restaurante.setId(id);

            restaurante.setProdutos(new ArrayList<>());
            restaurantes.add(restaurante);

            System.out.println(restaurantes.toString());

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Restaurante buscarRestaurante(int id) {
        for (Restaurante restaurante : restaurantes)
            if (id == restaurante.getId()) return restaurante;
        return null;
    }

    public Boolean adicionarProdutoAoRestaurante(Produto produto, int id){
        Restaurante restaurante = buscarRestaurante(id);
        if (restaurante != null){
            restaurante.adicionarProduto(produto);
            System.out.println(restaurantes.toString());
            return true;
        }
        return false;
    }

    public String listarRestaurantes(){
        String restaurantesOutput = "";
        for (Restaurante restaurante : restaurantes) {
            restaurantesOutput += restaurante.getId() + " - " + restaurante.getNome() + "\n";
        }
        return restaurantesOutput;
    }
}