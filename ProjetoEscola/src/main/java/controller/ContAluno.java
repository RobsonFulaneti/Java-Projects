package main.java.controller;

import main.java.model.Aluno;
import java.util.ArrayList;
import java.util.List;

public class ContAluno {

    public static class AlunoController{

       List<Aluno> alunos = new ArrayList();

       public String adicionarAluno (String nome, int serie, String turma, int idAluno){
           try {
               Aluno aluno = new Aluno();

               aluno.setNome(nome);
               aluno.setSerie(serie);
               aluno.setTurma(turma);
               aluno.setIdAluno(idAluno);

               alunos.add(aluno);
               return "Aluno adicionado com sucesso \n";
           }catch (Exception e){
               e.printStackTrace();
               return "Erro";
           }
       }

       public Aluno buscarAluno (int idAluno){
           for (int i = 0; i < alunos.size(); i ++){
               if (idAluno == alunos.get(i).getIdAluno()){
                   return alunos.get(i);
               }
           }
           return null;
       }

       public String deletarAluno (int idAluno){
           try {
               alunos.remove(buscarAluno(idAluno));
               return "Aluno deletado com sucesso";
           }catch (Exception e){
               e.printStackTrace();
               return "Erro";
           }
       }

       public String listarAluno (){
               String print = "";
               for (int i = 0; i < alunos.size(); i++) {
                   print += alunos.get(i).printarAluno();
               }
               return print;
       }

       public String atualizarAluno(String novoNome) {
           for (int j = 0; j < alunos.size(); j++) {
               alunos.get(j).setNome(novoNome);
           }
           return "Alterado com sucesso";
       }

       public String atualizarTurma(String novaTurma) {
           for (int j = 0; j < alunos.size(); j++){
               alunos.get(j).setTurma(novaTurma);
           }
           return "Alterado com sucesso";
       }

       public String atualizarSerie (int novaSerie){
           for (int j = 0; j < alunos.size(); j ++){
               alunos.get(j).setSerie(novaSerie);
           }
           return "Alterado com sucesso";
       }
    }
}