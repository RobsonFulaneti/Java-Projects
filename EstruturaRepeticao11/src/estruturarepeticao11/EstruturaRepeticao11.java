package estruturarepeticao11;

import java.util.Scanner;

public class EstruturaRepeticao11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, soma = 0;
        String resp;
        do {
            System.out.print("Digite um numero: ");
            num = teclado.nextInt();
            soma += num;
            System.out.println("Quer continuar ?");
            resp = teclado.next().toUpperCase();
        } while (resp.equals("S"));
        System.out.println("A Soma dos numero é: " + soma);

    }

}
