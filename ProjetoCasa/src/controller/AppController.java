package controller;

import model.Casa;
import model.Comodo;
import model.Movel;
import service.CasaService;
import service.ComodoService;
import service.MovelService;

public class AppController {
    private CasaService casaService = new CasaService();
    private ComodoService comodoService = new ComodoService();
    private MovelService movelService = new MovelService();

    public String adicionarMovel(String nome, int idMovel) {
        Boolean sucesso = movelService.adicionarMovel(nome, idMovel);
        if (sucesso) {
            return "Movel foi adicionado";
        }
        return "Erro";
    }

    public String listarMovel() {
        return movelService.listarMovel();
    }

    public Movel buscarMovel(int idMovel){
        return movelService.buscarMovel(idMovel);
    }

    public String adicionarComodo(String nome, int idComodo) {
        Boolean sucesso = comodoService.adicionarComodo(nome, idComodo);
        if (sucesso) {
            return "Comodo foi adicionado";
        }
        return "Erro";
    }

    public String listarComodo() {
        return comodoService.listarComodo();
    }

    public Comodo buscarComodo(int idComodo){
        return comodoService.buscarComodo(idComodo);
    }

    public String adicionarCasa(int num) {
        Boolean sucesso = casaService.adicionarCasa(num);
        if (sucesso) {
            return "Casa adicionada";
        }
        return "Erro";
    }

    public String listarCasa() {
        return casaService.listarCasas();
    }

    public Casa buscarCasa(int num){
        return casaService.buscarCasa(num);
    }

    public String adicioncarComodoaCasa (int idComodo, int idCasa){
        Comodo comodo = comodoService.buscarComodo(idComodo);
        if (comodo != null){
            Boolean sucesso = casaService.adicioncarComodoaCasa(comodo, idCasa);
            if (sucesso) return "Comodo adicionado a casa";
            }
            return "Erro";
    }

    public String adicionarMovelaoComodo (int idMovel, int idComodo){
        Movel movel = movelService.buscarMovel(idMovel);
        if (movel != null){
            Boolean sucesso = comodoService.adicionarMovelaoComodo(movel, idComodo);
            if (sucesso) return "Movel adicionado ao comodo";
        }
        return "Erro";
    }

}