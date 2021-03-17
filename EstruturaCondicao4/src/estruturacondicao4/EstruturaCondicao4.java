package estruturacondicao4;

import java.util.Scanner;

public class EstruturaCondicao4 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        float n1 = teclado.nextFloat();
        System.out.println("Digite o segundo numero: ");
        float n2 = teclado.nextFloat();
        System.out.println("Digite o terceiro numero: ");
        float n3 = teclado.nextFloat();
        
        if (n1 >= n2 && n1 >= n3 && n2 >= n3){
            System.out.println("Maior para o menor: " +n1 +", " + n2+", " + n3 + ".");              
        }else if (n1 >= n3 && n1 >= n2 && n3 >= n2){
            System.out.println("Maior para o menor: " +n1 +", " + n3+", " + n2 + ".");              
        }else if (n2 >= n1 && n2 >= n3 && n1 >= n3){
            System.out.println("Maior para o menor: " +n2 +", " + n1+", " + n3 + ".");              
        }else if (n2 >= n3 && n2 >= n1 && n3 >= n1){
            System.out.println("Maior para o menor: " +n2 +", " + n3+", " + n1 + ".");              
        }else if (n3 >= n1 && n3 >= n2 && n2 >= n1){
            System.out.println("Maior para o menor: " +n3 +", " + n2+", " + n1 + ".");              
        }else if (n3 >= n2 && n3 >= n1 && n1 >= n2){
            System.out.println("Maior para o menor: " +n3 +", " + n1+", " + n2 + ".");              
        }
    }
    
}
