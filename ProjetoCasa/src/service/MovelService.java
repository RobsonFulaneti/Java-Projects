package service;

import model.Movel;

import java.util.ArrayList;
import java.util.List;

public class MovelService {

    private List<Movel> moveis = new ArrayList<>();

    public Boolean adicionarMovel(String nome, int idMovel) {

        try {
            Movel movel = new Movel();

            movel.setNome(nome);
            movel.setIdMovel(idMovel);

            moveis.add(movel);

            System.out.println(movel.toString());

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Movel buscarMovel (int idMovel) {
        for (Movel movel : moveis) {
            if (idMovel == movel.getIdMovel()) return movel;
        }
        return null;
    }

    public String listarMovel(){
        String allMoveis = "";
        for(Movel movel : moveis){
            allMoveis += movel.getIdMovel() + "-" + movel.getNome() + " ";
        }
        return allMoveis;
    }
}