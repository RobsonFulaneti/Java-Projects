package service;

import model.NovoTestamento;

public class NovoService {

    NovoTestamento novoTestamento = new NovoTestamento();

    public Boolean adicionarNovoTestamento(String nomeNovo) {
        try {
            novoTestamento.getLivrosNovo().add(nomeNovo);

            System.out.println(novoTestamento.toString());

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
