package view;

import controller.ProdutoCont;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ProdutoCont.ProdutoController produtoController = new ProdutoCont.ProdutoController();
        Scanner teclado = new Scanner(System.in);
        int opc;
        do {
            System.out.println("MENU");
            System.out.println("1 - Adicionar produto \n2 - Consultar produto \n3 - Remover \n4 - Listar \n0 - SAIR");
            System.out.print("Digite a opção desejada: ");
            opc = teclado.nextInt();
            teclado.nextLine();
            System.out.println("");

            switch (opc){
                case 1:
                    System.out.print("Informe o nome do produto: ");
                    String prod = teclado.next();
                    System.out.print("Informe o valor do produto: ");
                    double valorProduto = teclado.nextDouble();
                    System.out.print("Informe o código do produto: ");
                    int codigo = teclado.nextInt();

                    System.out.println(produtoController.adicionarProduto(prod, valorProduto, codigo));
                    break;
                case 2:
                    System.out.print("Informe o código do produto: ");
                    codigo = teclado.nextInt();
                    System.out.println(produtoController.buscarProduto(codigo));
                    break;
                case 3:
                    System.out.print("Informe o código do produto: ");
                    codigo = teclado.nextInt();
                    System.out.println(produtoController.removerProduto(codigo));
                    break;
                case 4:
                    System.out.println("LISTA DE PRODUTOS");
                    System.out.println(produtoController.listarProdutos());
                    break;
            }
        }while(opc !=0);
    }
}
