package estruturarepeticao3;

import java.util.Scanner;

public class EstruturaRepeticao3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i = 0;
        float media;
        float valor = 0;
        while (i < 5) {
            System.out.println("Digite um numero: ");
            float num = teclado.nextFloat();
            valor += num;
            i += 1;
        }
        media = valor / 5;
        System.out.println("A média dos valores é: " + media);
        System.out.println("A soma dos valores é: " + valor);
    }
}