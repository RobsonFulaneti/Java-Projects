
package estruturacondicao2; 

import java.util.Scanner;

public class EstruturaCondicao2 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    float n1, n2, maior;
        System.out.println("Digite o primeiro numero: ");
        n1 = teclado.nextFloat();
        System.out.println("Digite o segundo numero: ");
        n2 = teclado.nextFloat();
        if (n1 > n2){
            System.out.println("O primeiro numero " + n1 + " é maior que " + n2);
        }else if (n2 > n1){
            System.out.println("O segundo numero " + n2 + " é maior que " + n1);
        }else{
            System.out.println("Os numeros " + n1 + " e " + n2 + "são iguais");
        }
        
    }
    
}