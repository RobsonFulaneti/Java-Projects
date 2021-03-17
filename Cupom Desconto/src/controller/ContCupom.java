package controller;

import model.Cupom;
import model.Passageiro;

import java.util.ArrayList;
import java.util.List;

public class ContCupom {

    public static class CupomController {

        List<Cupom> cupons = new ArrayList();

        public String listarCupom() {
            String print = "";
            for (int i = 0; i < cupons.size(); i++) {
                print += cupons.get(i).printarCupom();
            }
            return print;
        }

        public String adicionarCupom(String nomeCupom, int codigo, String validade, double desconto) {
            try {
                Cupom cupom = new Cupom();

                cupom.setCodigo(codigo);
                cupom.setDesconto(desconto);
                cupom.setNomeCupom(nomeCupom);
                cupom.setValidade(validade);

                cupons.add(cupom);
                return "Cupom Cadastrado\n";
            } catch (Exception e) {
                e.printStackTrace();
                return "Erro";
            }
        }

        public String adicionarPax(String pax, int numeroTel, int codigo) {
            try {
                Passageiro passageiro = new Passageiro();

                passageiro.setPax(pax);
                passageiro.setNumeroTel(numeroTel);
                passageiro.setCodigo(codigo);

                for (int i = 0; i < cupons.size(); i++) {
                    if (codigo == cupons.get(i).getCodigo()) {
                        cupons.get(i).getPassageiros().add(passageiro);
                    }
                }
                return "Passageiro Cadastrado\n";
            } catch (Exception e) {
                e.printStackTrace();
                return "Erro";
            }
        }

        public Cupom buscarCupom(int codigo) {

            for (int i = 0; i < cupons.size(); i++) {
                if (codigo == cupons.get(i).getCodigo()) {
                    return cupons.get(i);
                }
            }
            return null;
        }

        public String buscarPax(int codigo) {
            String print = "";
            for (int j = 0; j < cupons.size(); j++) {
                if (codigo == cupons.get(j).getCodigo()) {
                    for (int a = 0; a < cupons.get(j).getPassageiros().size(); a++) {
                        print += cupons.get(j).getPassageiros().get(a).printarPax();
                    }
                }
            }
            return print;
        }
    }
}
