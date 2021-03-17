package main;

import controller.AppController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        AppController controller = new AppController();

        controller.adicionarComissao(1);
        controller.adicionarPassageiroComissao("Robson", 12345, 1);
        controller.adicionarPassageiroComissao("Eduardo", 15467, 1);
        controller.adicionarProposta(1, "Ab", 1);
        controller.listarProposta();
    }
}