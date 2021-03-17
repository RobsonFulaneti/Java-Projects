
package estruturacondicao3;

import java.util.Scanner;

public class EstruturaCondicao3 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String sexo;
    
        System.out.println("Digite o sexo: ");
        sexo = teclado.next();
        
        if (sexo.substring(0, 1).matches("m|M")) {
            System.out.println("Sexo Masculino");
        }else if (sexo.substring(0, 1).matches("f|F")) {
            System.out.println("Sexo Feminino");
        }else{
            System.out.println("INVALIDO");
        }
        System.out.println("Tamanho da String: " + sexo.length() + " letras");
    }
    
}
