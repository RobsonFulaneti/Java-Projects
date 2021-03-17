package estruturarepeticao7;

import java.util.Scanner;

public class EstruturaRepeticao7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a = 1;
        int b = 0;
        int c;
        System.out.print("Informe um numero para a sequencia de Fibonacci: ");
        int num = teclado.nextInt();
        while (true) {
            c = a;
            a = a + b;
            b = c;
            if (a > num) {
                break;
            }
            System.out.print(a + " ");
        }
    }
}