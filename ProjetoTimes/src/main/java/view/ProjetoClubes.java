package view;

import controller.TimeController;

import java.util.Scanner;

public class ProjetoClubes {

    public static void main(String[] args) {

        TimeController timeController = new TimeController();

        Scanner teclado = new Scanner(System.in);

        int opc;

        do {
            System.out.println("Digite uma opção: ");
            System.out.println("1 - Adicionar clubes \n" + "2 - Excluir clubes \n"
                    + "3 - Listar os clubes \n" + "0 - SAIR");
            System.out.print("Digite a opção: ");
            opc = teclado.nextInt();
            teclado.nextLine();
            System.out.println("");

            switch (opc) {
                case 1:
                    System.out.print("Informe o nome do Time: ");
                    String nomeTime = teclado.nextLine();
                    System.out.print("Informe o País desse clube: ");
                    String paisTime = teclado.nextLine();
                    System.out.print("informe quantos titulos nacionais este clube tem: ");
                    int titulosNacionais = teclado.nextInt();
                    System.out.print("Informe quantos titulos continentais este clube tem: ");
                    int titulosContinentais = teclado.nextInt();
                    System.out.print("Informe quantos titulos mundiais este clube tem: ");
                    int titulosMundiais = teclado.nextInt();
                    System.out.print("Informe um ID para identificar esse clube: ");
                    int idClube = teclado.nextInt();

                    System.out.println(timeController.adicionarTime(nomeTime, paisTime, titulosNacionais,
                            titulosContinentais, titulosMundiais, idClube));
                    break;
                case 2:
                    System.out.print("Informe o ID do clube para ser deletado: ");
                    idClube = teclado.nextInt();
                    System.out.println(timeController.deleteTime(idClube));
                    break;
                case 3:
                    System.out.println("LISTA DE CLUBES");
                    System.out.println(timeController.listarTime());
                    break;
            }
        } while (opc != 0);

    }

}
