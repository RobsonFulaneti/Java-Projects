package estruturacondicao;

import java.util.Scanner;

public class EstruturaCondicao {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2) / 2;
        System.out.println("Sua média foi " + m);
        if (m >= 7) {
            System.out.println("Aprovado");
        } else if (m > 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }

}
