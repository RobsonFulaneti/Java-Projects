package projetocarro.controller;

import java.util.ArrayList;
import java.util.List;

import projetocarro.model.Aluguel;
import projetocarro.model.Carro;
import projetocarro.model.Cliente;

public class AluguelController {

    List<Aluguel> alugueis = new ArrayList();

    public String adicionarAluguel(int diarias, Carro carroEncontrado,
                                   int cpf, String nome, int idade) {
        try {
            Aluguel aluguel = new Aluguel();

            Cliente cliente = new Cliente();

            cliente.setCPF(cpf);
            cliente.setNome(nome);
            cliente.setIdade(idade);

            aluguel.setCarroEncontrado(carroEncontrado);
            aluguel.setDiarias(diarias);
            aluguel.setCliente(cliente);

            alugueis.add(aluguel);
            return "Sucesso, valor total: " + calcularAluguel(aluguel);

        } catch (Exception e) {
            return "erro";
        }
    }

    public double calcularAluguel(Aluguel aluguel) {

        return aluguel.getDiarias() * aluguel.getCarroEncontrado().getValorAluguel();

    }

    public String buscarAluguel(int CPF) {

        String alugueisStr = "";

        for (int i = 0; i < alugueis.size(); i++) {
            Aluguel aluguel = alugueis.get(i);
            if (CPF == aluguel.getCliente().getCPF()) {

                alugueisStr += "Carro: \n" + aluguel.getCarroEncontrado().printarCarro() + "\n";
                alugueisStr += "Cliente: \n" + aluguel.getCliente().printarCliente() + "\n";
                alugueisStr += "Diarias: " + aluguel.getDiarias() + "\n";
                alugueisStr += "Valor Total: " + calcularAluguel(aluguel) + "\n";
                alugueisStr += "==================\n";
            }
        }
        return alugueisStr;
    }
}
