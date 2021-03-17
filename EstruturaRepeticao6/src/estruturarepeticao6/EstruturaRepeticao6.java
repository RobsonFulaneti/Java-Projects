package estruturarepeticao6;

import java.util.Scanner;

public class EstruturaRepeticao6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        while (true) {
            int divisor = 0;
            int tot = 0;
            System.out.print("Informe maior que 2 para primos ou 1 para encerrar o programa: ");
            int num = teclado.nextInt();
            if (num == 1) {
                break;
            }
            if (num < 2) {
                System.out.println("Numero invalido");
            } else {
                for (int i = 1; i <= num; i++) {
                    if ((num % i) == 0) {
                        divisor++;
                        tot +=1;
                    }
                }
            }
            if (divisor == 2) {
                System.out.println("O numero " + num + " é primo"); 

            } else {
                System.out.println("O numero " + num + " nao é primo, pois é foi divisivel por " + tot + " vezes");
            }
        }
    }
}
