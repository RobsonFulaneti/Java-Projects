package estruturarepeticao9;

import java.util.Scanner;

public class EstruturaRepeticao9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um numero para sabermos quantos numeros primos existem ate esse numero informado: ");
        int num = teclado.nextInt();
        for (int i = 0; i < num; i++) {
            int divisor = 0;
            int numero =0;
            for (int c = 1; c <= num; c++) {
                if (i % c == 0) {
                    divisor++;
                    numero = c;
                }

            }
            if (divisor == 2) {
                System.out.println(numero);

            }
        }
    }
}
