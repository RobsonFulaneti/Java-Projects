package service;

import model.Comodo;
import model.Movel;

import java.util.ArrayList;
import java.util.List;

public class ComodoService {

    private List<Comodo> comodos = new ArrayList<>();

    public Boolean adicionarComodo(String nome, int idComodo) {

        try {
            Comodo comodo = new Comodo();

            comodo.setNome(nome);
            comodo.setId(idComodo);
            comodos.add(comodo);

            System.out.println(comodo.toString());

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public String listarComodo() {
        String allComodos = "";
        for (Comodo comodo : comodos){
            allComodos += comodo.getId() + "-" + comodo.getNome() + " ";
        }
        return allComodos;
    }

    public Comodo buscarComodo(int idComodo){
        for (Comodo comodo : comodos)
            if (idComodo == comodo.getId()) return comodo;
        return null;
    }

    public Boolean adicionarMovelaoComodo (Movel movel, int idComodo){
        Comodo comodo = buscarComodo(idComodo);
        if (comodo != null){
            comodo.getMoveis().add(movel);
            return true;
        }
        return false;
    }
}