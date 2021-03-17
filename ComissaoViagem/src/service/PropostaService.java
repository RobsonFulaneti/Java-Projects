package service;

import model.Comissao;
import model.Proposta;

import java.util.ArrayList;
import java.util.List;

public class PropostaService {

    private List<Proposta> propostas = new ArrayList<>();

    public Boolean adicionarProposta(int numProposta, String destino, Comissao comissao) {
        try {
            Proposta proposta = new Proposta();

            proposta.setNumProposta(numProposta);
            proposta.setDestino(destino);
            proposta.setComissao(comissao);

            propostas.add(proposta);
            System.out.println(proposta.toString());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public Proposta buscarProposta(int numProposta){ //assinatura do metodo
        /*"Proposta" Assinatura do metodo, é composta por:
         acessibilidade (public, private)
         tipo do retorno(String, void, boolean...)
         nome do metodo (Oque quiser)
         parametro (Oque for necessário)*/
        for (Proposta proposta : propostas){
            if(numProposta == proposta.getNumProposta())return proposta;
        }
        return null;
    }
    public String listarPropostas(){
        String saidaOutPut = "";
        for (Proposta proposta : propostas){
            saidaOutPut = proposta.getNumProposta() + "-" + proposta.getDestino();
        }
        return saidaOutPut;
    }

}
