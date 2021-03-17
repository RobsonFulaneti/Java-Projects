package projetocarro.controller;

import java.util.ArrayList;
import java.util.List;

import projetocarro.model.Carro;

public class CarrosController {

    List<Carro> carros = new ArrayList();

    public String adicionarCarro(String marcaCarro, String modeloCarro, String corCarro,
                                 String estadoCarro, int anoCarro, int idCarro, double valorAluguel) {
        try {
            Carro carro = new Carro();

            carro.setAnoCarro(anoCarro); //popular objeto
            carro.setCorCarro(corCarro); //popular objeto
            carro.setEstadoCarro(estadoCarro); //popular objeto
            carro.setMarcaCarro(marcaCarro); //popular objeto
            carro.setModeloCarro(modeloCarro); //popular objeto
            carro.setIdCarro(idCarro);//popular objeto
            carro.setValorAluguel(valorAluguel);

            carros.add(carro); //carros = nome da lista; add = adicionar; (oque vai ser adicionado);

            return "Sucesso";
        } catch (Exception e) {
            e.printStackTrace();
            return "erro";
        }
    }

    public String removerCarro(int idCarro) {
        try {
            carros.remove(buscarCarro(idCarro));

            return "Sucesso";
        } catch (Exception e) {
            e.printStackTrace();
            return "erro";
        }
    }

    public String listaCarro() {
        String print = "";
        for (int i = 0; i < carros.size(); i++) {
            print += carros.get(i).printarCarro();
        }
        return print;
    }

    public Carro buscarCarro(int idCarro) {

        for (int i = 0; i < carros.size(); i++) {

            if (idCarro == carros.get(i).getIdCarro()) {

                return carros.get(i);
            }
        }
        return null;
    }
}
//carros.get(i) => pegando o carro na posição i da lista
//.getIdCarro() => pegando o id desse carro

//Carro carro = carros.get(i); Outra forma
//if (idCarro == carro.getIdCarro) {
