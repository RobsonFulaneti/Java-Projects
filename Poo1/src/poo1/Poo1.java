package poo1;

import java.util.Scanner;

public class Poo1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Aluno[] alunos = new Aluno[3];

        for (int i = 0; i < alunos.length; i++) {
            Aluno aluno = new Aluno();

            System.out.print("Informe o nome do aluno: ");
            aluno.nome = teclado.next();
            System.out.print("Digite a primeira nota do aluno: ");
            aluno.nota1 = teclado.nextInt();
            System.out.print("Digite a segunda nota do aluno: ");
            aluno.nota2 = teclado.nextInt();
            System.out.print("Digite a terceira nota do aluno: ");
            aluno.nota3 = teclado.nextInt();


            alunos[i] = aluno;
            System.out.println("A media final é: " + aluno.media());
            aluno.media();
            System.out.println("" + aluno.status(aluno.media()));
        }
    }
}