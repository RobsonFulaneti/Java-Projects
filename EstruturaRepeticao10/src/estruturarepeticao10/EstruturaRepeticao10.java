
package estruturarepeticao10;

import java.util.Scanner;

public class EstruturaRepeticao10 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um numero para a tabuada: ");
        int numero = teclado.nextInt();
        System.out.print("Digite o inicio da tabuada: ");
        int inicio = teclado.nextInt();
        System.out.print("Digite até qual numero ela vai: ");
        int fim = teclado.nextInt();
        while (inicio <= fim){
            int resultado = inicio * numero;
            System.out.println(numero + " x " + inicio + ": " + resultado);
            inicio ++;
        }
        
    }
    
}
