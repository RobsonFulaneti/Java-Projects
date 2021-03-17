package controller;

import model.Time;

import java.util.ArrayList;
import java.util.List;

public class TimeController {

    List<Time> times = new ArrayList();

    public String adicionarTime(String nomeTime, String paisTime, int titulosNacionais,
                                int titulosContinentais, int titulosMundiais, int idTime) {
        try {
            Time time = new Time();

            time.setNomeTime(nomeTime); //popular objeto
            time.setPaisTime(paisTime); //popular objeto
            time.setTitulosNacionais(titulosNacionais); //popular objeto
            time.setTitulosContinentais(titulosContinentais); //popular objeto
            time.setTitulosMundiais(titulosMundiais);//popular objeto
            time.setIdTime(idTime);//popular objeto

            times.add(time);

            return "Sucesso";
        } catch (Exception e) {
            e.printStackTrace();
            return "erro";
        }
    }

    public Time buscarTime(int idTime) {

        for (int i = 0; i < times.size(); i++) {

            if (idTime == times.get(i).getIdTime()) {

                return times.get(i);
            }
        }
        return null;
    }

    public String deleteTime(int idTime) {
        try {
            times.remove(buscarTime(idTime));
            return "Sucesso";

        } catch (Exception e) {
            e.printStackTrace();
            return "erro";
        }
    }

    public String listarTime() {
        String print = "";
        for (int i = 0; i < times.size(); i++) {
            print += times.get(i).printarTime();
        }
        return print;
    }

}

