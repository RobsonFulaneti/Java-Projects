package main;

import controller.AppController;
import model.Casa;
import model.Comodo;

import java.util.Scanner;

public class Main { //EU CONSEGUI

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AppController appController = new AppController();

        appController.adicionarMovel("Televisão", 1);
        appController.adicionarMovel("Sofá", 2);
        appController.adicionarMovel("Cama", 3);

        appController.adicionarComodo("Sala", 1);
        appController.adicionarComodo("Quarto", 2);

        appController.adicionarCasa(1);
        appController.adicionarCasa(2);

        System.out.println(appController.listarMovel());
        System.out.println(appController.listarComodo());
        System.out.println(appController.listarCasa());

        int opc;

        do {
            System.out.println("\n ***** Menu *****");
            System.out.println("Digite a opção: \n1 - Vincular movel ao comodo \n2 - Printar o comodo \n3 - Vincular comodo a Casa" +
                    "\n4 - Printar a casa \n0 - SAIR");
            System.out.print("Digite a opção: ");
            opc = sc.nextInt();
            sc.nextLine();
            System.out.println("");

            switch (opc) {
                case 1:
                    System.out.println("Informe o id do movel: ");
                    int idMovel = sc.nextInt();
                    System.out.println("Informe o Id do comodo: ");
                    int idComodo = sc.nextInt();
                    System.out.println(appController.adicionarMovelaoComodo(idMovel, idComodo));
                    break;

                case 2:
                    System.out.println(appController.listarComodo());
                    System.out.println("Informe o id do comodo");
                    idComodo = sc.nextInt();
                    Comodo comodo = appController.buscarComodo(idComodo);

                    if (comodo != null) System.out.println(comodo);
                    break;
                case 3:
                    System.out.println("Informe o número da casa");
                    int idCasa = sc.nextInt();
                    System.out.println("Informe o id do comodo");
                    idComodo = sc.nextInt();
                    System.out.println(appController.adicioncarComodoaCasa(idComodo, idCasa));
                    break;
                case 4:
                    System.out.println(appController.listarCasa());
                    System.out.println("informe o id da casa");
                    idCasa = sc.nextInt();
                    Casa casa = appController.buscarCasa(idCasa);

                    if (casa != null) System.out.println(casa);
                    break;
            }
        } while (opc != 0);
    }
}