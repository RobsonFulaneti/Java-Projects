package service;

import model.Comissao;
import model.Passageiro;

import java.util.ArrayList;
import java.util.List;

public class ComissaoService {

    private List<Comissao> comissoes = new ArrayList<>();

    public Boolean adicionarPassageiro(String nome, int celular, int id) {
        try {
            for (Comissao comissao : comissoes) {
                if (id == comissao.getId()) {

                    Passageiro passageiro = new Passageiro();//instanciando, criando um novo passageiro
                    passageiro.setNome(nome);//popular o objeto
                    passageiro.setCelular(celular);

                    comissao.getPassageiros().add(passageiro);//Adicionando passageiro na lista de passageiros da comissao
                }
                System.out.println(comissao.toString());
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public Boolean criarComissao(int id) {
        try {
            Comissao comissao = new Comissao();

            comissao.setId(id);
            comissoes.add(comissao);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public Comissao buscarComissao(int id) {
        for (Comissao comissao : comissoes) {
            if (id == comissao.getId()) return comissao;
        }
        return null;
    }

    public String listarComissao() {
        String saidaOutPut = "";
        for (Comissao comissao : comissoes) {
            saidaOutPut = comissao.getId() + "-" + comissao.getPassageiros().toString();
        }
        return saidaOutPut;
    }

}