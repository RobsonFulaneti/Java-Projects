package estruturacondicao5;

import java.util.Scanner;

public class EstruturaCondicao5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        float n1 = teclado.nextFloat();
        System.out.println("Digite um numero: ");
        float n2 = teclado.nextFloat();
        if (n1 > n2){
            System.out.println("O primeiro numero digitado é o maior");
        }else if (n2 > n1){
            System.out.println("O segundo numero digitado é o maior");
        }else{
            System.out.println("Os dois numeros sao iguais");
        }
    }

}
