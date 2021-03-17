package service;

import model.Casa;
import model.Comodo;

import java.util.ArrayList;
import java.util.List;

public class CasaService {

    List<Casa> casas = new ArrayList<>();

    public Boolean adicionarCasa (int num) {

        try {
            Casa casa = new Casa();

            casa.setIdCasa(num);
            casas.add(casa);

            System.out.println(casa.toString());

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public String listarCasas () {
        String allCasas = "";
        for (Casa casa : casas){
            allCasas += casa.getIdCasa() + " ";
        }
        return allCasas;
    }

    public Casa buscarCasa (int num) {
        for (Casa casa : casas)
            if (num == casa.getIdCasa()) return casa;
            return null;
    }

    public Boolean adicioncarComodoaCasa (Comodo comodo, int num){
        Casa casa = buscarCasa(num);
        if (casa != null){
            casa.getComodos().add(comodo);
            return true;
        }
        return false;
    }
}