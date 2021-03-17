package projetocarro.view;

import java.util.Scanner;

import projetocarro.controller.CarrosController;
import projetocarro.controller.AluguelController;
import projetocarro.model.Carro;

public class ProjetoCarro {

    public static void main(String[] args) {

        CarrosController carrosController = new CarrosController();
        AluguelController aluguelController = new AluguelController();

        Scanner teclado = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("******* MENU *******");
            System.out.println("1 - Adicionar Carro\n" + "2 - Excluir Carro\n"
                    + "3 - Alugar carro\n" + "4 - Consultar aluguel\n"
                    + "5 - Lista de carros\n" + "0 - SAIR");
            System.out.print("Digite a opção que deseja: ");
            opcao = teclado.nextInt();
            teclado.nextLine();
            System.out.println("");

            switch (opcao) {
                case 1: //adicionar carro                    
                    System.out.print("Informe a Marca do carro: ");
                    String marcaCarro = teclado.nextLine();
                    System.out.print("Informe o modelo do carro: ");
                    String modeloCarro = teclado.nextLine();
                    System.out.print("Informe a cor do carro: ");
                    String corCarro = teclado.nextLine();
                    System.out.print("Informe se o carro é novo ou usado: ");
                    String estadoCarro = teclado.nextLine();
                    System.out.print("informe o ano do carro: ");
                    int anoCarro = teclado.nextInt();
                    System.out.print("Informe o ID de identificação do carro: ");
                    int idCarro = teclado.nextInt();
                    System.out.print("Informe o valor do aluguel diário: ");
                    double valorAluguel = teclado.nextDouble();

                    System.out.println(carrosController.adicionarCarro(marcaCarro, modeloCarro, corCarro,
                            estadoCarro, anoCarro, idCarro, valorAluguel));
                    break;
                case 2:
                    System.out.print("Informe o ID que deseja excluir: ");
                    idCarro = teclado.nextInt();
                    System.out.println(carrosController.removerCarro(idCarro));
                    break;
                case 3:
                    System.out.print("Informe o nome do cliente: ");
                    String nome = teclado.next();
                    System.out.print("Informe o CPF do cliente: ");
                    int CPF = teclado.nextInt();
                    System.out.print("Informe a idade do cliente: ");
                    int idade = teclado.nextInt();
                    System.out.print("Informe o ID do carro a ser alugado: ");
                    idCarro = teclado.nextInt();
                    System.out.print("Informe quantas diarias: ");
                    int diarias = teclado.nextInt();
                    Carro carroEncontrado = carrosController.buscarCarro(idCarro);
                    System.out.println(aluguelController.adicionarAluguel(diarias,
                            carroEncontrado, CPF, nome, idade));
                    break;
                case 4:
                    System.out.print("Informe o CPF do cliente: ");
                    CPF = teclado.nextInt();

                    System.out.println(aluguelController.buscarAluguel(CPF));
                    break;

                case 5:
                    System.out.println("******* LISTA DE CARROS *******");
                    System.out.println(carrosController.listaCarro());
                    break;
            }
        } while (opcao != 0);
    }
}