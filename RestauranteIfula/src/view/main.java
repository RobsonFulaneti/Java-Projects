package view;

import controller.AppController;
import model.Produto;
import model.Restaurante;
import service.PedidoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        AppController appController = new AppController();

        Scanner teclado = new Scanner(System.in);

        int opc;

        do {
            System.out.println("\n*****MENU*****");
            System.out.println("1 - Adicionar restaurante \n2 - Adicionar produto \n3 - Vincular produto ao restaurante " +
                    "\n4 - Realizar pedido \n5 - Buscar pedido \n0 - SAIR");
            System.out.print("Digite a opção: ");
            opc = teclado.nextInt();
            teclado.nextLine();
            System.out.println("");

            switch (opc) {
                case 1:
                    System.out.print("Informe o ID do restaurante: ");
                    int id = teclado.nextInt();
                    teclado.nextLine();
                    System.out.print("");
                    System.out.print("Informe o nome do restaurante: ");
                    String nomeRestaurante = teclado.nextLine();

                    String output = appController.adicionarRestaurante(id, nomeRestaurante);
                    System.out.println(output);
                    break;
                case 2:
                    System.out.print("Informe o id do produto: ");
                    id = teclado.nextInt();
                    teclado.nextLine();
                    System.out.print("");
                    System.out.print("Informe o produto: ");
                    String nomeProduto = teclado.nextLine();
                    System.out.print("Informe o valor: ");
                    double valor = teclado.nextDouble();

                    System.out.println(appController.adicionarProduto(id, nomeProduto, valor));
                    break;
                case 3:
                    System.out.println(appController.listarProdutos());
                    System.out.print("Informe o id do produto para adicionar ao restaurante: ");
                    int idProduto = teclado.nextInt();
                    System.out.println(appController.listarRestaurantes());
                    System.out.print("Informe o id do restaurante: ");
                    int idRestaurante = teclado.nextInt();

                    System.out.println(appController.adicionarProdutoAoRestaurante(idProduto, idRestaurante));
                    break;
                case 4:
                    System.out.println(appController.listarRestaurantes());
                    System.out.print("Informe o id do restaurante: ");
                    idRestaurante = teclado.nextInt();
                    Restaurante restaurante = appController.buscarRestaurante(idRestaurante);

                    if (restaurante != null) {
                        System.out.print("Informe o id do pedido: ");
                        int numPedido = teclado.nextInt();
                        List<Produto> produtos = new ArrayList<>();

                        int opcProduto;

                        do {
                            System.out.print(restaurante.listarProdutos());
                            System.out.print("Digite o id do produto ou 0 para finalizar: ");
                            opcProduto = teclado.nextInt();
                            if (opcProduto != 0)
                            produtos.add(appController.buscarProduto(opcProduto));
                            System.out.println("o numero do pedido é: " + numPedido);
                            System.out.print(appController.adicionarPedido(numPedido, opcProduto, restaurante, produtos));
                        } while (opcProduto != 0);

                        System.out.println("o numero do pedido é: " + numPedido);
                    }
                    break;
                case 5:
                    System.out.print("Informe o numero do pedido: ");
                    int numPedido = teclado.nextInt();
                    System.out.println(appController.buscarPedido(numPedido));
                    break;
            }
        } while (opc != 0);
    }
}
