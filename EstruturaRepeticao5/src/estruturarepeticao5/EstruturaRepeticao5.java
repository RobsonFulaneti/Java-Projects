package estruturarepeticao5;

import java.util.Scanner;

public class EstruturaRepeticao5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i = 0;
        int valor;
        
        System.out.print("Digite um numero para a tabuada: ");
        int num = teclado.nextInt();
        
        System.out.println("A tabuada do " + num + " é:");
        
        while (i <= 10) {
            valor = i * num;
            
            System.out.println(num + " x " + i + " = " + valor);
            i++;
        }

    }

}
