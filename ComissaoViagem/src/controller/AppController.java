package controller;

import model.Comissao;
import model.Proposta;
import service.ComissaoService;
import service.PropostaService;

public class AppController {

    private PropostaService propostaService = new PropostaService();
    private ComissaoService comissaoService = new ComissaoService();

    public String adicionarProposta(int numProposta, String destino, int id) {

        Comissao comissao = comissaoService.buscarComissao(id);
        if (comissao != null) {
            Boolean sucesso = propostaService.adicionarProposta(numProposta, destino, comissao);
            if (sucesso) {
                return "Proposta Adicionada";
            }
        }

        return "Erro ao adicionar";
    }

    public String adicionarComissao(int id) {
        Boolean sucesso = comissaoService.criarComissao(id);
        if (sucesso) {
            return "Comissao Criada";
        }
        return "Erro ao criar";
    }

    public String adicionarPassageiroComissao(String nome, int numero, int id) {
        try {
            comissaoService.adicionarPassageiro(nome, numero, id);
            return "Passageiro adicionado";
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro";
        }
    }

    public String listarProposta() {
        return propostaService.listarPropostas();
    }

    private Proposta buscarProposta(int numProposta) {
        return propostaService.buscarProposta(numProposta);
    }

    private String listarComissao() {
        return comissaoService.listarComissao();
    }

}
