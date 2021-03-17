package main.java.view;

import main.java.controller.ContAluno;

import java.util.Scanner;

public class ViewEscola {

    public static void main(String[] args) {

        ContAluno.AlunoController alunoController = new ContAluno.AlunoController();

        Scanner teclado = new Scanner(System.in);
        int opc;

        do {
            System.out.println("\n*************MENU*************");
            System.out.println("1 - Adicionar o aluno \n2 - Deletar aluno \n3 - Alterar aluno " +
                    "\n4 - Buscar Aluno \n5 - Listas Alunos \n0 - Sair");
            System.out.print("Digite a opção desejada: ");
            opc = teclado.nextInt();
            teclado.nextLine();
            System.out.println("");

            switch (opc){
                case 1:
                    System.out.println("Adicionar o Aluno");

                    System.out.print("Informe o nome do Aluno: ");
                    String nome = teclado.nextLine();

                    System.out.print("Informe a serie do Aluno: ");
                    int serie = teclado.nextInt();

                    System.out.print("Informe a turma do Aluno: ");
                    String turma = teclado.next();

                    System.out.print("informe o numero de identificação do aluno: ");
                    int idAluno = teclado.nextInt();

                    System.out.print(alunoController.adicionarAluno(nome, serie, turma, idAluno));
                    break;

                case 2:
                    System.out.println("Deletar Aluno");
                    System.out.print("\nInforme o Id do Aluno para deletar: ");
                    idAluno = teclado.nextInt();
                    System.out.println(alunoController.deletarAluno(idAluno));
                    break;

                case 3:
                    System.out.println("Alterar Aluno");
                    System.out.print("\ninforme o Id do Aluno que deseja alterar: ");
                    idAluno = teclado.nextInt();
                    System.out.println(alunoController.buscarAluno(idAluno));

                    System.out.print("\n1 - Nome do Aluno \n2 - Turma do Aluno \n3 - Serie do Aluno \nQual dado deseja alterar ? ");
                    int opcao = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("");
                    switch (opcao){
                        case 1:
                            System.out.print("Informe o nome do Aluno: ");
                            String novoNome = teclado.nextLine();
                            System.out.println(alunoController.atualizarAluno(novoNome));
                            break;
                        case 2:
                            System.out.print("Informe a nova turma do aluno: ");
                            String novaTurma = teclado.next();
                            System.out.println(alunoController.atualizarTurma(novaTurma));
                            break;
                        case 3:
                            System.out.print("Informe a nova serie do aluno: ");
                            int novaSerie = teclado.nextInt();
                            System.out.println(alunoController.atualizarSerie(novaSerie));
                            break;
                    }
                    break;

                case 4:
                    System.out.println("Buscar Aluno");
                    System.out.print("Informe o Id do aluno: ");
                    idAluno = teclado.nextInt();
                    System.out.println(alunoController.buscarAluno(idAluno));
                    break;

                case 5:
                    System.out.println("Alunos Cadastrados: ");
                    System.out.println(alunoController.listarAluno());
                    break;
            }
        }while (opc != 0);
    }
}