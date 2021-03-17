package view;

import controller.ContCupom;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        ContCupom.CupomController cupomController = new ContCupom.CupomController();

        Scanner teclado = new Scanner(System.in);
        int opc;

        do {
            System.out.println("*****MENU*****");
            System.out.println("1 - Cadastrar cupom de desconto \n2 - Cadastrar celular \n3 - Listar cupons cadastrados " +
                    "\n4 - Listar alunos cadastrados para determinado cupom \n0 - SAIR");
            System.out.print("Digite a opção: ");
            opc = teclado.nextInt();
            teclado.nextLine();
            System.out.println("");

            switch (opc) {
                case 1:
                    System.out.println("Cadastrar cupom:");
                    System.out.print("Informe o nome do cupom: ");
                    String nomeCupom = teclado.nextLine();
                    System.out.print("Informe o código do cupom: ");
                    int codigo = teclado.nextInt();
                    System.out.print("Informe a validade do cupom: ");
                    String validade = teclado.next();
                    System.out.print("Informe o valor do desconto: ");
                    double desconto = teclado.nextDouble();
                    System.out.println(cupomController.adicionarCupom(nomeCupom, codigo, validade, desconto));
                    break;
                case 2:
                    System.out.println("Cadastrar passageiro: ");
                    System.out.print("Informe o nome do Passageiro: ");
                    String pax = teclado.nextLine();
                    System.out.print("Informe o celular do passageiro: ");
                    int numeroTel = teclado.nextInt();
                    System.out.print("Informe o código do cupom: ");
                    codigo = teclado.nextInt();
                    System.out.println(cupomController.adicionarPax(pax, numeroTel, codigo));
                    break;
                case 3:
                    System.out.println("Lista de cupons cadastrados: ");
                    System.out.print(cupomController.listarCupom());
                    break;
                case 4:
                    System.out.print("Informe o codigo do cupom: ");
                    codigo = teclado.nextInt();
                    System.out.println(cupomController.buscarCupom(codigo));
                    System.out.println("Os passageiros cadastrados para esse cupom são: ");
                    System.out.println(cupomController.buscarPax(codigo));
                    break;
            }
        } while (opc != 0);
    }
}
