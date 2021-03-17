package service;

import model.VelhoTestamento;

public class VelhoService {

    VelhoTestamento velhoTestamento = new VelhoTestamento();

    public Boolean adicionarVelhoTestamento(String nomeVelho) {
        try {


            velhoTestamento.getLivrosVelho().add(nomeVelho);

            System.out.println(velhoTestamento.toString());

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
