package estruturarepeticao2;

import java.util.Scanner;

public class EstruturaRepeticao2 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
        System.out.println("Digite seu primeiro nome para cadastro: ");
        String nome = teclado.next();
        while (true){
            System.out.println("Digite sua senha: ");
            String senha = teclado.next();
            if (nome.equals(senha)){
                System.out.println("Sua senha nao pode ser igual ao nome..");
            }else{
                System.out.println("CADASTRO EFETUADO COM SUCESSO");
            }
        }
        
    }
    
}