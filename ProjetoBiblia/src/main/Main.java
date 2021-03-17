package main;

import service.NovoService;
import service.VelhoService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner teclado = new Scanner(System.in);
        VelhoService velhoService = new VelhoService();
        NovoService novoService = new NovoService();

        velhoService.adicionarVelhoTestamento("Genesis");
        velhoService.adicionarVelhoTestamento("Exodo");
        novoService.adicionarNovoTestamento("Mateus");
    }
}
