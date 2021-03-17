package estruturarepeticao12;

import java.util.Scanner;

public class EstruturaRepeticao12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num, total = 0, soma = 0, impar = 0, par = 0, centena = 0;
        float media = 0;
        do {
            System.out.print("Informe um numero: ");
            num = teclado.nextInt();
            total += 1;
            soma += num;
            if (num % 2 == 0) {
                par += 1;
            } else {
                impar += 1;
            }
            media = soma/total;
            if (num > 100){
                centena += 1;
            }
        } while (num != 0);
        System.out.println("Resultado Final");
        System.out.println("Numeros digitados: " + total);
        System.out.println("Soma total: " + soma);
        System.out.println("Numeros pares total: " + par);
        System.out.println("Numeros impares total: " + impar);
        System.out.println("Media dos valores: " + media);
        System.out.println("Acima de 100: " + centena);
    }
}
