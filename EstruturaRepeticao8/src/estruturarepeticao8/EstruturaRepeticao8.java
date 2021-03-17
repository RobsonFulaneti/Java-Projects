package estruturarepeticao8;

import java.util.Scanner;

public class EstruturaRepeticao8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um numero para o fatorial: ");
        int num = teclado.nextInt();
        int valor = 1;
        int c = num;
        System.out.print(num + "!: ");
        while (c > 0) {

            if (c > 1) {
                System.out.print(c + " x ");
            } else {
                System.out.print(c + " = " + valor + " ");
            }
            valor *= c;
            c -= 1;

        }

    }
}
