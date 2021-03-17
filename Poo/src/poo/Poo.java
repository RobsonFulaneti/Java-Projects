package poo;

import java.util.Scanner;

public class Poo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Caneta c1 = new Caneta();
        System.out.println("Digite a cor da caneta: ");
        c1.cor = teclado.next();
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();

    }
}