package main.java.model;

public class Aluno {

    private String nome;
    private int serie;
    private String turma;
    private int idAluno;

    public String printarAluno(){
        String print = "";
        print += "O nome do aluno é: " + getNome() + "\n";
        print += "O aluno " + getNome() + " esta na serie: " + getSerie() + "\n";
        print += "O aluno " + getNome() + " esta na turma: " + getTurma() + "\n";
        print += "O id cadastrado para o Aluno é: " + getIdAluno() + "\n";
        print += "\n";
        return print;
    }

    @Override
    public String toString(){
        return "\nAluno cadastrado com o ID informado: \n" + "Nome do Aluno = " + nome + ", serie = " + serie + ", "
                + "turma = " + turma + ", idAluno = " + idAluno + "\n";
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public int getSerie() {

        return serie;
    }

    public void setSerie(int serie) {

        this.serie = serie;
    }

    public String getTurma() {

        return turma;
    }

    public void setTurma(String turma) {
        
        this.turma = turma;
    }

    public int getIdAluno() {

        return idAluno;
    }

    public void setIdAluno(int idAluno) {

        this.idAluno = idAluno;
    }

}