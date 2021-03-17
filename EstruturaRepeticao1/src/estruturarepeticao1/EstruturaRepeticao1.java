package estruturarepeticao1;

import java.util.Scanner;

public class EstruturaRepeticao1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        while (true) {
            System.out.println("Digite um numero entre 0 e 10");
            int num = teclado.nextInt();
            if (num <= 10 & num > 0) {
                System.out.println("Correto! O número " + num + " está entre 0 e 10 ");
                break;
            } else {
                System.out.println("Digite novamente, o numero " + num + " não está entre 0 e 10");
                System.out.println("");
            }
        }
    }
}